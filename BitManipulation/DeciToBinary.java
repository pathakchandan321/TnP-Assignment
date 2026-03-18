package BitManipulation;

public class DeciToBinary {
    public static void main(String[] args) {
        int n=2;
        String s="";
        while(n != 0){
            if ((n&1)==0){
                s+="0";
            }else {
                s+="1";
            }
            n=n/2;
        }
        System.out.println(new StringBuilder(s).reverse().toString());
    }
}
