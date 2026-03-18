package AssesmentTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution2{
    public boolean maping(String s1,String s2){
        if(s1.length() != s2.length()) return false;
        int[] m1=new int[26];
        int[] m2=new int[26];
        Arrays.fill(m1,-1);
        Arrays.fill(m2,-1);
//        Map<Character,Character> m1=new HashMap<>();
//            for (int i = 0; i < s1.length(); i++) {
//
//                if(m1.containsKey(s1.charAt(i))){
//                    if(m1.get(s1.charAt(i))!=s2.charAt(i)){
//                        return false;
//                    }else if(m1.containsValue(s1.charAt(i))){
//                        return false;
//                    }
//                }
//                 m1.put(s1.charAt(i),s2.charAt(i));
//            }
//        for(int i=0;i<s1.length();i++){
//            int c1=s1.charAt(i)-'a';
//            int c2=s2.charAt(i)-'a';
//            if(m1[c1]!=-1 && m2[c2 ]!=-1) {
//                m1[c2] = c1;
//                m2[c1] = c2;
//            }else {
//                if(m1[c1] != c2 || m2[c2] != c1){
//                    return false;
//                }
//            }
//        }

        return true;
    }
}
public class Question2 {
    public static void main(String[] args) {
        Solution2 obj= new Solution2();
        boolean x=obj.maping("mohit","rohit");
        if (x){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}

