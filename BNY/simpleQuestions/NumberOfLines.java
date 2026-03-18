package BNY.simpleQuestions;

import java.util.Scanner;

public class NumberOfLines {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a string\n");
        String s=input.nextLine();
        int ans=0;
//        int count=0,i=0;
//        while(i<s.length()) {
//            if (s.charAt(i)==' ') {
//                count++;
//            }
//            i++;
//        }
//        if((count+1)%2==0){
//            System.out.println((count+1)/2);
//        }else{
//            System.out.println((count+2)/2);
//        }
        String[] tokens=s.split("\\s+");
        for(String x:tokens) {
            if (x.isEmpty()) continue;
            boolean invalid = false;
            for(int i=0;i<x.length();i++){
                char c=x.charAt(i);
                if(!Character.isLetter(c)){
                    if(i != 0){
                        if(i==x.length()-1) {
                            if (c == ',' || c == '.' || c == ';' || c == ':' || c == '?' || c == '!')
                                continue;
                        }else if (c == '.' && i + 1 < x.length() && x.charAt(i + 1) != '.') {
                                invalid=true;
                                break;
                        } else if (c == '-' && i + 1 < x.length() && Character.isLetter(x.charAt(i + 1))) {
                                continue;
                        }else {
                            invalid=true;
                                break;
                            }
                        }else {
                        invalid=true;
                        break;
                    }
                }
            }
            if (!invalid) {
                ans++;
            }
        }
        int lines = (int) Math.floor((ans - 1) / 2.0) + 1;
        System.out.println(lines);

    }
}
