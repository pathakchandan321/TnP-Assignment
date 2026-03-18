package BitManipulation;

public class BinaryToDeci {
    public static void main(String[] args) {
        String s="1001";
        int n=s.length();
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=((s.charAt(i)-'0')<<n-i-1); //we can not use charAt() directly with integer
        }                                   //we need to -'0' first to make it asci code
                                             //1=49 and 0=48 now 49-48=1 , 5=53(53-48)= 5
        System.out.println(sum);
    }
}
