package Array;
//it works only on 2 duplicates numbers
//it also work oon unsorted array
public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[]={1,3,2,3,4,2,1};
        int i=0;
        int x=1;
        while(x<arr.length){
            if(arr[i]==arr[x]){
                arr[x]=0;
                i++;
                x=i;
            }
            x++;

        }
        //move all zeros to the last
        int k=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j] != 0){
                arr[k]=arr[j];
                k++;
            }
        }
        for(int j=k;j<arr.length;j++){
            arr[j]=0;
        }
        for (int y:arr){
            System.out.print(y+" ");
        }
    }
}
