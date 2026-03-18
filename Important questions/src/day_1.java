import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class day_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("enter your name");
//        String name=input.next();
//        if(name.equals("chandan")){
//            System.out.println("you can enter ");
//        }
//        else{
//            System.out.println("you can't enter");
//        }
        System.out.println("enter your marks");
        int x=input.nextInt();

        if(x<50){
            System.out.println("Grade C");
        }
        else if(x>=50 && x<80){
            System.out.println("Grade B");
        }
        else if(x>=80){
            System.out.println("Grade A");
        }
        System.out.println("enter month");
        int month=input.nextInt();
        switch(month){
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("december");
                break;
            default:
                System.out.println("invalid month");
        }
    }
}
