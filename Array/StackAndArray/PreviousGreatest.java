package Array.StackAndArray;

import java.util.Stack;

public class PreviousGreatest {
    public static void previousGreater1(int arr[],int n){
        int greatest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<greatest){
                int temp=arr[i];
                arr[i]=greatest;
                greatest=temp;
            }else{
                greatest=arr[i];
                arr[i]=-1;
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void previousGreater(int arr[],int n){
        Stack<Integer> stack=new Stack<>();
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        for (int y:ans){
            System.out.print(y+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={10,4,2,8,11,9};
        int n=arr.length;
        previousGreater(arr,n);
    }
}
