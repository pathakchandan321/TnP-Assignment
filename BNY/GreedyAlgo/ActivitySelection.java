package BNY.GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ActivitySelection {
    public static void main(String[] args) {
      int start[]={1,3,0,5,8,5};
      int finish[]={2,4,6,7,9,9};
      maxActivity(start,finish);
    }
    public static void maxActivity(int start[],int finish[]){
        ArrayList<Integer> ans=new ArrayList<>();
        int n=start.length;
        int activity[][]=new int[n][3];
        for(int i=0;i<n;i++){
            activity[i][0]=i+1;
            activity[i][1]=start[i];
            activity[i][2]=finish[i];
        }
        Arrays.sort(activity, Comparator.comparingInt(a->a[2]));
        int r=activity[0][2];
        ans.add(activity[0][0]);
        for(int i=1;i<activity.length;i++){
            if(activity[i][1]>r){
                ans.add(activity[i][0]);
                r=activity[i][2];
            }
        }
        Collections.sort(ans);
        System.out.println(ans);
    }
}
