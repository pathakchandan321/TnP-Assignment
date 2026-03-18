package BNY.recursion;

public class PossiblePath {
    public static int path(int i,int j,int m,int n){
        if (i==m || j==n) return 0;
        if(i==m-1 || j==n-1){
            return 1;
        }
        int right=path(i,j+1,m,n);
        int down=path(i+1,j,m,n);
        return right+down;
    }
    public static void main(String[] args) {
        System.out.println("total path="+path(0,0,3,3));
    }
}
