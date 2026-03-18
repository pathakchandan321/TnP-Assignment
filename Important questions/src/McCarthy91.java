public class McCarthy91 {
    public static void main(String[] args) {
        int n=9;
        System.out.println(calaulate(n));
    }
    public static int calaulate(int n){
        if(n>100){
            return n-10;
        }else{
            return calaulate(calaulate(n+11));
        }
    }
    
}
