package AssesmentTest;

class Solution1{
    public String reverse(String s){
        String newS=new StringBuilder(s).reverse().toString();
        return newS;
    }

    public String exchange(String s){
        String rev=reverse(s);
        StringBuilder newString=new StringBuilder();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<rev.length();i++) {
            char temp = rev.charAt(i);
            int position = i + 1;
            if (Character.isLetter(temp)) {
                if (Character.isLowerCase(temp)) {
                    if (position % 2 == 0) {
                        temp = (char) ('a' + (temp - 'a' - position + 26) % 26);
                    } else {
                        temp = (char) ('a' + (temp - 'a' + position + 26) % 26);
                    }
                } else {
                    if (position % 2 == 0) {
                        temp = (char) ('A' + (temp - 'A' - position + 26) % 26);
                    } else {
                        temp = (char) ('A' + (temp - 'A' + position + 26) % 26);
                    }
                }
                newString.append(temp);
            } else if (Character.isDigit(temp)) {
                int digit=temp-'0';
                    newString.append((digit + position) % 10);
                }
            }
        for (int i=0;i<newString.length();i++){
            result.append(newString.charAt(i));
                if ((i+1) % 3 == 0 && i != newString.length()-1) {
                    result.append('#');
            }
        }
        return result.toString();
    }
}
public class Question1 {
    public static void main(String[] args) {
        String s="abcXYZ";
        Solution1 obj=new Solution1();
        String str=obj.exchange(s);
        System.out.println(str);
    }
}
