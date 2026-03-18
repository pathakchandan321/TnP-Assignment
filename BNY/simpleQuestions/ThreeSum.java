package BNY.simpleQuestions;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int a[]={1,3,4,5,3,2,1,2,1};
        System.out.println(sum(a));
    }
    public static int sum(int a[]){
        int sum=0;
        int count=0;
        int max=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(sum+a[j]<=6){
                    sum=sum+a[j];
                    count++;
                    max=Math.max(count,max);
                    Arrays.asList(a[i]);
                }else {
                    count = 0;
                    sum = 0;
                    break;
                }
            }
        }
        return max;
    }
}
