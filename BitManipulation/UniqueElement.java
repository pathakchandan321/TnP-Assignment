package BitManipulation;
/*
it works only when even no of elements occurs
[1,1,2,2,3]
[1,2,3,4,1,2,3]
 */
public class UniqueElement {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int n=arr.length,unique=0;
        for (int i=0;i<n;i++){
            unique=unique^arr[i];
        }
        System.out.println(unique);
    }
}
