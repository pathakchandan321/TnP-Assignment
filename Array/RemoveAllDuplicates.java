package Array;

import java.util.*;

public class RemoveAllDuplicates {
    public static void removeDuplicate(int arr[]){
        List<Integer> l=new ArrayList<>();
        l.add(arr[0]);
        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]==temp){
                continue;
            }else{
                l.add(arr[i]);
                temp=arr[i];
            }
        }
        System.out.println(l);
    }
    public static void removeAllDuplicates(int arr[]){
        Map<Integer,Integer> m=new HashMap();
        int n=arr.length;
        for (int x:arr) {
            if(m.containsKey(x)){
                m.put(x,m.get(x)+1);
            }else {
                m.put(x, 1);
            }
        }
        Set<Integer> s=m.keySet();
        for (int x:s){
            if(m.get(x)==1){
                System.out.print(x+" ");
            }
        }
    }
    public static void duplicate(int arr[],int n){
        Stack<Integer> stack=new Stack<>();
        stack.push(arr[0]);
        for(int i=1;i<n;i++){
            if(stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.peek());
            stack.pop();
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,5};
      // removeAllDuplicates(arr);
       duplicate(arr,arr.length);
    }
}
