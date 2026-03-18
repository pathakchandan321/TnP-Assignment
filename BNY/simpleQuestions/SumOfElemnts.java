package BNY.simpleQuestions;

import java.util.Scanner;

public class SumOfElemnts {
    public static void main(String[] args) {
//        int a[]={1,2,3,4,5};
//        int sum=a[0];
//        for (int i=1;i<a.length;i++){
//            sum=sum+a[i];
//        }
//        System.out.println(sum);
        Scanner s=new Scanner(System.in);
//        char[] c=new char[5];
//        String y=new String();
        int a[]={4,3,6,1,2};
//        System.out.println("enter the characters");
//        for (int i=0;i<5;i++){
//            c[i]=s.next().charAt(0);
//        }
//        for (int j=0;j<c.length;j++){
//            y=y+c[j];
//        }
//        System.out.println(y);
        int min=a[0];
        for (int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }

        }
        System.out.println(min);
    }
}
