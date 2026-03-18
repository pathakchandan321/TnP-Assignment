import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int d;   //this variable use to state that from where we need to rotate the array
        Scanner in=new Scanner(System.in);
        d=in.nextInt();
        int j=n-1;      //use two pointer approach to solve the problem without using extra space
        for(int i=0;i<=d;i++){  //swape the elements one by one
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           j--;
        }
        System.out.println("after rotation");
        for(int i=0;i<n;i++){    //print the rotated array
            System.out.println(arr[i]);
        }
    }
}
