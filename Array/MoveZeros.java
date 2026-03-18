package Array;

public class MoveZeros {
    public static void main(String[] args) {
        int arr[]={0,4,3,6,5,0,8,6};
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=j;i<n;i++){
            arr[i]=0;
        }

        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
