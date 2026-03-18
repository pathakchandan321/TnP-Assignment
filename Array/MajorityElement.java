package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void majorityElement1(int arr[]){
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:arr){
            if(m.containsKey(i)){
                m.put(i,m.get(i)+1);
            }else{
                m.put(i,1);
            }
        }
        int min=0;int ans=arr[0];
        for(Map.Entry<Integer,Integer> entry:m.entrySet()){
            if(entry.getValue()>min){
                min=entry.getValue();
                ans=entry.getKey();
            }
        }
        System.out.println("majority element="+ans);
    }
    public static void majorityElement2(int arr[]){
        int ansIndx=0;
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[ansIndx]){
                count++;
            }else{
                count--;
            }
            if(count==0) {
                ansIndx = i;
                count = 1;
            }
        }
        int count1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[ansIndx]==arr[i]){
                count1++;
            }
        }
        if(count1>arr.length/2){
            System.out.println("majority element is "+arr[ansIndx]);
        }else{
            System.out.println("No majority element found");
        }
    }
    public static void major(int arr[]){
        Arrays.sort(arr);
        int n=arr.length,prevCount=0,currCount=1,temp=arr[0],ans=0;
        for(int i=1;i<n;i++){
            if(arr[i]==temp){
                currCount++;
            }else{
                if(currCount>prevCount){
                    prevCount=currCount;
                    ans=temp;
                }
                temp=arr[i];
                currCount=1;
            }
            if (currCount>prevCount){
                ans=temp;
            }
        }
        System.out.println(ans);
    }
    public static int majorityElement(int[] nums) {

        int count = 0;
        int candidate = 0;

        for(int num : nums){

            if(count == 0){
                candidate = num;
            }

            if(num == candidate){
                count++;
            }else{
                count--;
            }
        }

        return candidate;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,1,4,1,2,1,3,2,1,3};
        //majorityElement2(arr);
       // majorityElement1(arr);
        //major(arr);
        System.out.println(majorityElement(arr));
    }
}
