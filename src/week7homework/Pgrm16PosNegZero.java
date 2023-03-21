package week7homework;

import java.util.Scanner;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */
public class Pgrm16PosNegZero {
    public static void main(String[] args) {
        Pgrm16PosNegZero obj = new Pgrm16PosNegZero();
        obj.checkNumber();
    }
    public void checkNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("The number is positive.");
        }else if(num<0){
            System.out.println("The number is negative");
        }else {
            System.out.println("The number is Zero");
        }

    }
}
