package Array;

public class SearchInRotatedArray {
    public static int search(int arr[],int target){
        int f=0,l=arr.length-1;
        while(f<=l){
            int mid=f+(l-f)/2;
            if(arr[mid]==target){
                 return mid;
            }
            if(arr[mid]>=arr[f]){
                if (target>=arr[f] && target<arr[mid]){
                    l=mid-1;
                }else {
                    f=mid+1;
                }
            }else {
                if (target>arr[mid] && target<=arr[l]){
                    f=mid+1;
                }else {
                    l=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         int arr[]={4,5,6,7,0,1,2,3};
        System.out.println("found at "+search(arr,3));
    }
}
