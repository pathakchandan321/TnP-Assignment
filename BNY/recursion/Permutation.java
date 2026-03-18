package BNY.recursion;

public class Permutation {
    static int count=0;
    public static void permutation(String s,String permutation){
        if(s.length()==0){
            System.out.println(permutation);
            count++;
            return;
        }
        for(int i=0;i<s.length();i++){
            String newSubString=s.substring(0,i)+s.substring(i+1);
            permutation(newSubString,permutation+newSubString);
        }
    }
    public static void main(String[] args) {
        String s="abc";
        permutation(s," ");
        System.out.println("total no of count="+count);
    }
}
