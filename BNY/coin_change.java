package BNY;

public class coin_change {
    public static void main(String[] args) {
        int x[]={1,7,5};
        int n=18;
        dp=new int[n+1];
        int result=minCoin(n, x);
        System.out.println(result);
    
    }  
    public static int[] dp;

    public static int minCoin(int n,int[] a){
        if(n==0) return 0;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(n-a[i]>=0){
                int subAns=minCoin(n-a[i], a);
                if(subAns != Integer.MAX_VALUE && subAns+1<max){
                      max=subAns+1;
                }
            }

        }
        return max;
    }
   
}
