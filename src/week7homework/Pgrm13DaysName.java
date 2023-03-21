package week7homework;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and
 * it print The Days name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

public class Pgrm13DaysName {
    public static void main(String[] args) {
        Pgrm13DaysName obj = new Pgrm13DaysName();
        obj.daysName();

    }
    public void daysName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number from 1 to 7 ");
        int num = sc.nextInt();
        switch(num){
            case 1:
                System.out.println("The day name is Monday.");
                break;
            case 2 :
                System.out.println("The day name is Tuesday.");
                break;
            case 3 :
                System.out.println("The day name is Wednesday ");
                break;
            case 4 :
                System.out.println("The day name is Thursday.");
                break;
            case 5 :
                System.out.println("The day name is Friday.");
                break;
            case 6 :
                System.out.println("The day name is Saturday.");
                break;
            case 7 :
                System.out.println("The day name is Sunday.");
                break;
            default:
                System.out.println("Week contains 1 to 7 days ");
        }sc.close();

    }
}
