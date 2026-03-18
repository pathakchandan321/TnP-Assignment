package Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void approach1(int arr[],int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                System.out.println("[" + map.get(complement) + " " + i + "]");
                return;
            }
            map.put(arr[i], i);
        }
    }
    public static void approach2(int arr[],int target){
        int n=arr.length;
        int newArr[]=new int[n];
        for(int i=0;i<n;i++){
            newArr[i]=arr[i];
        }
        Arrays.sort(newArr);
        for (int i=0;i<n;i++){
            int left=i+1,right=n-1;
            while(left<right){
                int sum=newArr[left]+newArr[right];
                if(sum==target){
                    for (int j=0;j<n;j++){
                        if(arr[j]==newArr[left]){
                            System.out.println(j);
                        }
                        if(arr[j]==newArr[right]){
                            System.out.println(j);
                        }
                    }
                }
                if(sum>target){
                    right--;
                }else{
                    left++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,2,6,7};
        approach1(arr,10);
        approach2(arr,10);
    }
}
