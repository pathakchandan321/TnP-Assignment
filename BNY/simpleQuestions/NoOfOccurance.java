package BNY.simpleQuestions;

import java.util.HashMap;
import java.util.Map;

public class NoOfOccurance {
    public static void main(String[] args) {

       String s="banana";
//       int count=0;
//       int sum=0;
//        Map<Character , Integer> m=new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//
//            if (c != ' ') {
//                m.put(c, m.getOrDefault(c, 0) + 1);
//            }
//        }
//        System.out.println(m);
        int freq[]=new int[26];
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a' && c<='z'){
                freq[c-'a']++;
            }
        }
        for(int j=0;j<freq.length;j++){
            if(freq[j]>0){
                System.out.println((char)(j+'a')+"->"+freq[j]);
            }
        }
    }

}
