package Array.StackAndArray;

import java.util.Stack;

public class SecondSmallest {
    public static void main(String[] args) {
        int arr[]={1,4,6,2,8,3};
        int n=arr.length;
        Stack<Integer> s=new Stack<>();
        for(int x:arr){
            s.push(x);
        }
        int firstSmallest=Integer.MAX_VALUE;
        while(!s.isEmpty()){
            firstSmallest=Math.min(firstSmallest,s.pop());
        }
        for (int x:arr){
            if(x != firstSmallest){
                s.push(x);
            }
        }
        int secondSmallest=Integer.MAX_VALUE;
        while(!s.isEmpty()){
            secondSmallest=Math.min(secondSmallest,s.pop());
        }
        System.out.println("first smallest="+firstSmallest+"\nsecond smallest="+secondSmallest);
    }
}
