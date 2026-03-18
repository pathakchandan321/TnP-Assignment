package Sort;

public class Selection {
    public static void main(String[] args) {
        int arr[]={3,2,6,1,5};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int mini=i;
            for(int j=i+1;j<n;j++){
                if(arr[mini]>arr[j]){
                    mini=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mini];
            arr[mini]=temp;
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
