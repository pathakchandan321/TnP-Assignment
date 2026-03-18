package String;

public class Encription {
    public static void main(String[] args) {
        String s="afb9r4gx";
        //StringBuilder sb=new StringBuilder(s);
        StringBuilder result=new StringBuilder();
        //reverse this String
        //sb.reverse();
        String r=new StringBuilder(s).reverse().toString();
        //System.out.println(sb);
        //traverse this reversed string
        for(int i=0;i<r.length();i++){
            int position=i+1;

            char ch=r.charAt(i);
            if (Character.isDigit(ch)){
                //digit transformation
                int digit=ch-'0';
                int newDigit=((digit+position)%10);
                result.append(newDigit);
            }else if (Character.isLetter(ch)){
                char base;
                if(Character.isUpperCase(ch))
                    base='A';
                else{
                    base='a';
                }
                int index=ch-base;
                if(position%2 == 0){
                    //odd position sift forward
                    index =((index+position))%26;
                }else {
                    index=(index-position%26+26)%26;
                }
                result.append((char) (base+index));
            }
        }
        //insert # after each 3rd position
        StringBuilder finalResult=new StringBuilder();
        for (int i=0;i<result.length();i++){
            finalResult.append(result.charAt(i));
            if ((i+1)%3==0) {
                finalResult.append('#');
            }
        }
        System.out.println(finalResult);
    }
}
