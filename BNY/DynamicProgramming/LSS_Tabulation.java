package BNY.DynamicProgramming;

public class LSS_Tabulation {
    public static int dp[][];
    public static void main(String[] args) {
        String a="ABCAB";
        String b="AECB";
        dp=new int[a.length()+1][b.length()+1];
        System.out.println("input String");
        System.out.println("ABCAB");
        System.out.println("AECB");
        System.out.println("longest subsequence = "+CountLss(a, b, dp));
        System.out.println("Sequence = "+ShowOutput(a, b, dp));
    }
    public static int CountLss(String a,String b,int dp[][]){
         for(int i=1;i<=a.length();i++){
            for (int j=1;j<=b.length();j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
         }
        return dp[a.length()][b.length()];
    }
    public static String ShowOutput(String a,String b,int dp[][]){
         StringBuffer s=new StringBuffer();
         int i=a.length();
         int j=b.length();
         while(i>0 && j>0){
            if(a.charAt(i-1)==b.charAt(j-1)){
                s.append(a.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j] > dp[i][j-1]){
                i--;
            }else{
                j--;
            }
         }
         return s.reverse().toString(); 
    }

}
