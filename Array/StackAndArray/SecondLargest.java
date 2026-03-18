package Array.StackAndArray;

import java.util.Stack;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={1,5,8,2,4,9,6,2};
        int n=arr.length;
        Stack<Integer> s=new Stack<>();
        for(int x:arr){
            s.push(x);
        }
        int firstLargest=0;
        while(!s.isEmpty()){
            firstLargest=Math.max(firstLargest,s.pop());
        }
        int secondLargest=0;
        for (int x:arr){
            if(x != firstLargest){
                s.push(x);
            }
        }
        while(!s.isEmpty()){
            secondLargest=Math.max(secondLargest,s.pop());
        }
        System.out.println("first largest="+firstLargest+"\nsecond largest="+secondLargest);
    }
}
