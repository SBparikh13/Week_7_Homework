package week7homework;
/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */

import java.util.Scanner;

public class Pgrm2LeapYear {//main method
    public static void main(String[] args) {
        Pgrm2LeapYear obj =new Pgrm2LeapYear();
        obj.leapYear();// called instance method to main
    }
    public void leapYear(){// instance method
        Scanner sc = new Scanner(System.in);// scanner declare
        System.out.println("Input the year :");
        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if(x && (y || z)){// used 'or' operator
            System.out.println(year + " is a leap year ");
        }else{
            System.out.println(year + " is not a leap year ");
        }sc.close();

    }
}
