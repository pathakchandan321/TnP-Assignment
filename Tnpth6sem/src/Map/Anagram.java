package Map;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        Map<Character,Integer> m=new HashMap<>();
        String s1="aman",s2="namak";
        if(s1.length()==s2.length()) {
            System.out.println("Not anagram");
            return;
        }
            for (char c:s1.toCharArray()){
                m.put(c,m.getOrDefault(c,0)+1);
            }
            for(char c:s2.toCharArray()){
                if(!m.containsKey(c)){
                    System.out.println("not anagram");
                    return;
                }
                m.put(c,m.getOrDefault(c,0)-1);
                if(m.get(c)==0){
                    m.remove(c);
                }
            }
            System.out.println((m.isEmpty() ? "Anagram":"Not anagram"));
    }
}
