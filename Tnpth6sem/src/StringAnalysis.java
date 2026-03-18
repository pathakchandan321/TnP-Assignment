import java.util.HashMap;

public class StringAnalysis {
    public static boolean make(String s1,String s2){
        for (int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            for(int j=0;j<s2.length();j++){
                if(ch == s2.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean newApproach(String s1,String s2){
        int freq[]=new int[26];
        for(char ch:s2.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:s2.toCharArray()){
            freq[ch-'a']--;
        }
       for(int i=0;i<26;i++){
           if(freq[i]<0){
               return false;
           }
       }
       return true;
    }
    public static void main(String[] args) {
        String s1="abc";
        String s2="aabc";
        System.out.println(make(s1,s2));
        System.out.println(newApproach(s1,s2));
    }
}
