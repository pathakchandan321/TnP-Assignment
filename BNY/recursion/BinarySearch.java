package BNY.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int f=0,l=a.length-1;
        if(search(f,l,a,5)){
            System.out.println("found");

        }else{
            System.out.println("not found");
        }

    }
    public static boolean search(int f,int l,int a[],int key){
        boolean status=false;
        int mid;
        if(f > l){
            return false;
        }
         mid=(f+l)/2;
        if(a[mid]==key){
            status= true;
        }
        else if(a[mid]>key){
            search(f,mid-1,a,key);
        }
        else{
            search(mid,l,a,key);
        }
        return status;
    }
}
