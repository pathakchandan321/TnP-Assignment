
/*2.Spiral Matrix Traverse, Given a 2D matrix,print all elements in spiral
order {clockwise from outside to inside}.*/
/*left-right--> top++
  top-bottom-->right--
  right-left-->bottom--
  bottom-top-->left++
  take a direction
  after each loop increase direction.
  direction=direction%4;  it decides which loop is to be executed
 */
import java.util.ArrayList;

class Spiral{
    public static void traverse(int [][] arr){
        ArrayList<Integer> ans=new ArrayList<>();
        //length of rows
        int top=0;
        int bottom=arr.length-1;
        //length of column
        int left=0;
        int right=arr[0].length-1;

        while(left<=right && top<=bottom){
            //1st row left to right
            for (int i=left;i<=right;i++){
                ans.add(arr[top][i]);
            }
            top++;
            //last column top to bottom
            for (int j=top;j<=bottom;j++){
                ans.add(arr[j][right]);
            }
            right--;

            //first column bottom to top
            if(top<=bottom) {
                for (int l = right; l >= left; l--) {
                    ans.add(arr[bottom][l]);
                }
                bottom--;
            }
            //last row right to left
            if(left<=right) {
                for (int k = bottom; k >= top; k--) {
                    ans.add(arr[k][left]);
                }
                left++;
            }
        }
        System.out.println(ans);
    }

}
public class SpiralMatrix{
    public static void main(String[] args) {
        //NextGreater.find();
        int arr[][]={{1,2,3},
                {4,5,6},
                {7,8,9}};
        Spiral.traverse(arr);

    }
}
