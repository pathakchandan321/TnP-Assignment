package BNY.DynamicProgramming;

import java.util.Arrays;

public class CoinChange {
    public static int[] dp;
    public static void main(String[] args) {
        int coins[]={1,5,7};
        int n=18;
        dp=new int[n+1];
       // Arrays.fill(dp, -1);
        //dp[0]=0;
        int result=minCoin(n, coins, dp);
        System.out.println(result);
        for (int x : dp) {
          System.out.print(x+" ");            
        }
        
    }
    public static int minCoin(int n,int[] a,int[] dp){
        if (n==0) return 0;
        int Ans=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(n-a[i]>=0){
                int subAns=0;
                if(dp[n-a[i]] !=0){
                    subAns= dp[n-a[i]];
                }else{
                     subAns=minCoin(n-a[i], a, dp);
                }
                if(subAns != Integer.MAX_VALUE && subAns+1<Ans){
                    Ans=subAns+1;
                }
            }
        }
        return dp[n]=Ans;
    }
    
}
