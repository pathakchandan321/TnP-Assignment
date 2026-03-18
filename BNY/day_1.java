package BNY;

public class day_1 {
    static int[] dp;
    public static int  fact(int n){
        
        if(n==0 || n==1){
            return dp[n]=1;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        dp[n]= n*fact(n-1);
        return dp[n];
    
}

    public static void main(String[] args) {
        int n=5;
        dp=new int[n+1];
        System.out.println(day_1.fact(n));
    }
}