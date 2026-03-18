package Recursion;

public class NQueen {
    static int n=4;
    public static void queen(int bord[][],int row){
        if(row==n){
            printBord(bord);
            System.out.println();
            return;
        }
        for(int column=0;column<n;column++) {
            if (isSafe(bord, row, column)) {
                bord[row][column] = 1;
                queen(bord, row + 1);
                bord[row][column] = 0;
            }
        }
    }
    public static boolean isSafe(int bord[][],int row,int col){
        //check for column
        for (int i=0;i<row;i++){
            if(bord[i][col]==1){
                return false;
            }
        }
        //check for upper-left diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if (bord[i][j]==1){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if (bord[i][j]==1){
                return false;
            }
        }
        return true;
    }
    public static void printBord(int bord[][]){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(bord[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int bord[][]=new int[4][4];
        queen(bord,0);
    }
}
