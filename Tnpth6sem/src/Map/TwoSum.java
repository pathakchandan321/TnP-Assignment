package Map;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int key=5,n=arr.length;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            int target=key-arr[i];
           if(m.containsKey(target)){
               System.out.println(m.get(target)+" "+i);
           }else{
               m.put(arr[i],i);
           }
        }
    }
}
