package Sets;

import java.util.HashSet;
import java.util.Set;
//count distinct element from two array
//arr1={7,8,7,58,78,100,120}
//arr2={58,100,
public class Test {
    public static void main(String[] args) {
        Set<Integer> st=new HashSet<>();
        int arr[]={8,9,11,12,13};
        int arr2[]={11,12,13,14,15,16};
        int n=arr.length;
        int m=arr2.length;
        for(int i=0;i<n;i++){
            st.add(arr[i]);
        }
        for(int i=0;i<m;i++){
            if(st.contains(arr2[i])){
                st.remove(arr[i]);
            }else {
                st.add(arr2[i]);
            }
        }
        System.out.println(st.size());
    }
}
