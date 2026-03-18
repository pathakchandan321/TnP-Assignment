package sorting;

import java.util.ArrayList;
//prefix sum
//prefix[j]-prefix[i-1]
public class Sorting {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7};
        int prefix[]=new int[arr.length];
        //ArrayList<Integer> prefix=new ArrayList<>();
        int maxSum=0;
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

            }
        }
        for(int i=0;i<prefix.length;i++){
            System.out.println(prefix[i]+" ");
        }
        System.out.println("maximum sub array="+maxSum);
    }
}
