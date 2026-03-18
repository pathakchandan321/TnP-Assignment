package BNY.DynamicProgramming;

public class LSS {
    public static int dp[][];
    public static void main(String[] args) {
        String a="ABCBD";
        String b="ABDE";
        int m=a.length();
        int n=b.length();
        dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
               dp[i][j]=-1;
            }
        }
        int result=longestSubSequence(m, n, a, b, dp);
        System.out.println(result);
        
    }
    public static int longestSubSequence(int m,int n,String a,String b,int dp[][]){
        if(m==0 || n==0){
            return 0;
        }
        if(dp[m][n] !=-1){
            return dp[m][n];
        }
        if(a.charAt(m-1)==b.charAt(n-1)){
            return dp[m][n]=1+longestSubSequence(m-1, n-1, a, b, dp);
        }else{
            return dp[m][n]=Math.max(longestSubSequence(m-1, n, a, b, dp), longestSubSequence(m, n-1, a, b, dp));
        }

    }
}
