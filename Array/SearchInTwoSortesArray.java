package Array;

public class SearchInTwoSortesArray {
    public static void mergeSortedArrays(int[] nums1, int[] nums2) {
        int sum=0,m=nums1.length,n=nums2.length;
        int[] arr=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n) {
            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }
        while (i<m){
            arr[k++]=nums1[i++];
        }
        while (j<n){
            arr[k++]=nums2[j++];
        }
        for (int x:arr){
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={1,4,6};
        int arr2[]={2,3};
        mergeSortedArrays(arr,arr2);
    }
}
