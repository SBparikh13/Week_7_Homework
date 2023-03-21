package week7homework;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any other alphabet should be invalid entry
 * Same as above program-8 using switch statement.
 */
public class Pgrm9CityNameSwitch {
    public static void main(String[] args) {
        Pgrm9CityNameSwitch obj = new Pgrm9CityNameSwitch();
        cityName1();
    }
    static String alphabet;
    public static void cityName1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an alphabet ");
        String alphabet = sc.next();
        switch(alphabet){
            case "A":
                System.out.println("City name is Abingdon");
            break;
            case "B":
                System.out.println("City name is Bristol");
                break;
            case "C":
                System.out.println("City name is Cambridge ");
                break;
            case "D":
                System.out.println("City name is Derby" );
                break;
            case "E":
                System.out.println("City name is Enfield ");
                break;
            case "F":
                System.out.println("City name is Foxley");
                break;
            default:
                System.out.println("Invalid Entry");

        }sc.close();
    }


}
