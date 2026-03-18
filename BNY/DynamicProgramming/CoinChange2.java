package BNY.DynamicProgramming;

public class CoinChange2 {
    public static int dp[];
    public static void main(String[] args) {
        int coin[]={1,2,3,4};
        int amount=4;
        dp=new int[amount+1];
        int x[]=countWays(amount, coin, dp);
        for(int i:x){
            System.out.print(i+" ");
        }
        
    }
    public static int[] countWays(int n,int[] a,int[] dp){
          dp[0]=1;
          for(int i=0;i<a.length;i++){
            for(int j=a[i];j<=n;j++){
                dp[j]=dp[j]+dp[j-a[i]];
            }
          }
          return dp;
    }
    
}
