package Array;

public class KadansAlgo {
    public static void nativeApproach(int arr[]){
        int n=arr.length;
        int maxSum=0;
        for(int i=0;i<n;i++){
            int sum=arr[i];
            for(int j=i+1;j<n;j++){
                sum+=arr[j];
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        System.out.println("maximum subarray sum (native approach)="+maxSum);
    }
    public static void optimalApproach(int arr[]){
        int maxSum=Integer.MIN_VALUE,sum=0,n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
//            if(sum>maxSum){
//                maxSum=sum;
//            }
            maxSum=Math.max(maxSum,sum);
            if(maxSum<0){
                sum=0;
            }
        }
        System.out.println("max sum sub array (optimal)="+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,-2,5,-6,1};
        nativeApproach(arr);
        optimalApproach(arr);
    }
}
