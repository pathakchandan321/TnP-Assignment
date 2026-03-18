package BitManipulation;

public class NoOf1sBit {
    public static void main(String[] args) {
        int n=15,count=0;//(15)2=1111 -- no of one's in 15 is 4
        while(n!=0){
            count++;
            n=n&(n-1); /*make last significant bit 0
                        1111-->1110-->1100-->1000-->0000
                      &(1110)&(1101)&(1001)&(0111)
                      ----------------------------
                        1110   1100   1000   0000
                        */
        }
        System.out.println(count);
    }
}
