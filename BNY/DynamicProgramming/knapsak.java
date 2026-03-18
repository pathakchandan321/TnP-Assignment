package BNY.DynamicProgramming;

public class knapsak {
    public static int dp[][];

    public static void main(String[] args) {
        int n=8;
        int x=4;
        int w[]={2,3,4,5};
        int p[]={1,2,5,6};
        dp=new int[x+1][n+1];
        int result=maxWeight(n, x, w, p, dp);
        System.out.println(result);
    }

    public static int maxWeight(int n,int x,int[] w,int[] p,int dp[][]){
         for(int i=0;i<=x;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }else{
                    if(w[i-1]<=j){
                        dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-w[i-1]]+p[i-1]);
                        
                    }else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
         }
         return dp[x][n];
    } 
}
