package Array.sorting;

class Solution1{
    public static void merge(int arr1[],int arr2[]){
        int m=arr1.length; int n= arr2.length;
        int newSize=m+n;
        int newArr[]=new int[newSize];
        for(int i=0;i<m;i++){
            newArr[i]=arr1[i];
        }
        for (int j=0;j<n;j++){
            newArr[j+m]=arr2[j];
        }
        for (int k=0;k<newSize;k++){
            System.out.print(newArr[k]+" ");
        }
    }

}
public class MergeSortedArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={5,6,7};
        Solution1.merge(arr1,arr2);
    }
}
