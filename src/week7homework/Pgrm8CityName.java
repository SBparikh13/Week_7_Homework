package week7homework;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 * if any other alphabet should be invalid entry
 */

public class Pgrm8CityName {
    public static void main(String[] args) {
        Pgrm8CityName obj = new Pgrm8CityName();
        obj.cityName();
    }
    public void cityName(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter an alphabet : ");
        String alphabet = sc.next();
        if(alphabet.equals("A")){
            System.out.println("City name is :  Abingdon");
        }else if(alphabet.equals("B")){
            System.out.println("City name is :  Bristol");
        }else if(alphabet.equals("c")){
            System.out.println("City name is : Cambridge");
        }else if(alphabet.equals("D")){
            System.out.println("City name is : Derby ");
        }else if(alphabet.equals("E")){
            System.out.println("City name is :  Enfield ");
        }else if(alphabet.equals("F")){
            System.out.println("City name is :  Foxley ");
        }else{
            System.out.println("Invalid entry.");
        }sc.close();

        }

        }


