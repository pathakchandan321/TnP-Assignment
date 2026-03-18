package Array;

public class WaterTapping {
    public static void main(String[] args) {
        int arr[]={3,1,2,4,0,1,3,2};
        int n=arr.length;
        int result=0;
        int[] lmax=new int[n];
        int[] rmax=new int[n];
        lmax[0]=arr[0];
        for (int i=1;i<n;i++){
            lmax[i]=Math.max(lmax[i-1],arr[i]);
        }

        rmax[n-1]=arr[n-1];
        for (int i=n-2;i>=0;i--){
           rmax[i]=Math.max(rmax[i+1],arr[i]);
        }
        //calculate trapped water
        for (int i=0;i<n;i++){
            result+=Math.min(lmax[i],rmax[i])-arr[i];
        }
        System.out.println("maximum water trapped="+result);

    }
}
