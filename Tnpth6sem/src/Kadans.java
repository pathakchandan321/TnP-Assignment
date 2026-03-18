public class Kadans {
    public static void main(String[] args) {
        int arr[]={1,4,6,-2,6};
        int maxSum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            if (currsum<0){
                currsum=0;
            }
            maxSum=Math.max(maxSum,currsum);
        }
        System.out.println(maxSum);
    }
}
