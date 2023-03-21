package week7homework;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
 * find addition, Subtraction, multiplication and division according to their symbol (using if else)
 */

public class Pgrm10Symbol {
    public static void main(String[] args) {
        Pgrm10Symbol obj = new Pgrm10Symbol();
        obj.symbol();

    }
    public void symbol(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number ");
        int num2 = sc.nextInt();
        System.out.println("Enter any symbol you want(+,_,*,/) ");
        char s = sc.next().charAt(0);
        if(s=='+'){
            System.out.println(" Addition of  " + num1+ "+"+num2 +" = "+(num1+num2));
        }else if(s=='-'){
            System.out.println("Subtraction of  " + num1 + "-" + num2 +" = "+(num1-num2));
        }else if(s=='*'){
            System.out.println("Multiplication of  " + num1+ "*"+num2 +" = "+(num1*num2));
        }else if(s=='/'){
            System.out.println("Division of  "  + num1+ "/"+num2 + " = "+(num1/num2));
        } else{
            System.out.println("Invalid");
        }sc.close();

    }

}
