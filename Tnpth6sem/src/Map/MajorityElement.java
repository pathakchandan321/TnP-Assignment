package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorityElement {
    public static void mazority(int arr[]){
        int n=arr.length;
        int appear=n/3;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            if(m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i])+1);
            }else {
                m.put(arr[i], 1);
            }
        }
        Set<Integer> s=m.keySet();
        for(int x:s){
            if(m.get(x)>appear) {
                System.out.println(x);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,2,1,3,1,2,4,1};
        mazority(arr);
    }
}
