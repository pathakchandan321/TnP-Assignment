package Array.StackAndArray;

import java.util.Stack;

public class NextGreater {
    public static void nextGreater(int arr[],int n){
        Stack<Integer> stk=new Stack<>();
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty() && stk.peek()<=arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=stk.peek();
            }
            stk.push(arr[i]);
        }
        for (int X:ans){
            System.out.print(X+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,8,3,4,2};
        int n=arr.length;
        nextGreater(arr,n);
    }
}
