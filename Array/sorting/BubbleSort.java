package Array.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={0,3,1,5,2,6,4};
        int n=arr.length,count=0;
        boolean swaped=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j+1]<arr[j]){
                    swaped=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                }
            }
            if(!swaped){
                break;
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println("\nthere are "+count+" swaps required");
    }
}
