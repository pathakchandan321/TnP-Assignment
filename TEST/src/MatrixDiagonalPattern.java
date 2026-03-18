public class MatrixDiagonalPattern {
    public static void main(String[] args) {
        int n=3;
        int arr[][]={{1,2,1},{2,1,5},{1,6,1}};
        int count=0;
        for(int i=0;i<n;i++){
            int temp=arr[i][i];    //find the primary diagonal (this method minimize the complexity)
            int temp1=arr[i][n-(i+1)];  //find secondary diagonal
            if(temp==temp1){        //check the condition that the primary and secondary diagonal are same or  not
                count++;    //increase the counting if same to trace the equality
            }
        }
        if(count==3){   //since I create n*n matrix diagonal size must be n
            System.out.println("matched");
        }else{
            System.out.println("not matched");
        }
    }
}

