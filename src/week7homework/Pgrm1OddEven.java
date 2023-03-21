package week7homework;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Pgrm1OddEven {
    public static void main(String[] args) {// main method
        Pgrm1OddEven obj = new Pgrm1OddEven();
        // obj.mymethod();
        obj.myMethod2();// called instance method to main
    }

    public void myMethod2() {
        Scanner scan1 = new Scanner(System.in);// scanner declare
        System.out.println("Enter a number :");
        int a = scan1.nextInt();
        String num = a % 2 == 0 ? "Even" : "Odd";// used ternary operator
        System.out.println(a + " is an " + num + " number");
        scan1.close();
    }
}


