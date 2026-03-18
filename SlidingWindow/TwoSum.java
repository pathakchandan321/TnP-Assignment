package SlidingWindow;

import java.util.HashMap;

public class TwoSum {
    public static void naive(int []arr,int target){
        //target sum using sliding window
        // this is only  for continuous subArray
        int ans[]=new int[2];
        int n=arr.length;
        int left=0,sum=0;
        for(int right=0;right<n;right++){
            sum+=arr[right];
            while(sum>target){
                sum-=arr[left];
                left++;
            }
            if(sum==target){
                System.out.println("["+left+" "+right+"]");
                return;
            }
        }
    }
    //this is optimal solution works on any types of arrays
    public static void optimal(int[] arr, int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                System.out.println("["+map.get(complement)+" "+i+"]");
                return;
            }
            map.put(arr[i],i);
        }
    }
    public static void main(String[] args) {
         int arr[]={1,25,7,3,5};
         naive(arr,10);  //bot are not same it works on continuous subArray
         optimal(arr,6);//it works ony any types of array;
    }
}
