package Array.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={2,5,3,1,4};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int minElement=i;
            for(int j=i+1;j<n;j++) {
                if (arr[j] < arr[minElement]) {
                    minElement = j;
                }
            }
            if(minElement != i) {
                int temp = arr[minElement];
                arr[minElement] = arr[i];
                arr[i] = temp;
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
