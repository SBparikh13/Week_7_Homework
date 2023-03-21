package week7homework;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
 * Commission Sales amount >= 50,000 35% Sales amount >= 30,000 20% >= 20,000 10% >= 10,000 5% < 10,000 2%
 */
public class Pgrm7SalesCommision {
    public static void main(String[] args) {
        Pgrm7SalesCommision obj = new Pgrm7SalesCommision();
        obj.salaryCommision();

    }
    public void salaryCommision(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter sales ID  :  ");
        int salesID = sc.nextInt();
        System.out.println("Enter seller's name : ");
        String sellername = sc.next();
        System.out.println("Enter sales amount : ");
        double amount = sc.nextDouble();
        System.out.println("Enter salary basic :  ");
        double basic = sc.nextDouble();
        if(amount>=50000.0){
            System.out.println("Sale commision : " + (amount*35)/100);
        }else if(amount>=30000.0){
            System.out.println("Slae commision  : " + (amount*20)/100);
        }else if(amount>=20000.0){
            System.out.println("Sale commision  : " + (amount*10)/100);
        }else if(amount>=10000.0){
            System.out.println("Sale commision  : " + (amount*5)/100);
        }else{
            System.out.println("Sales commision : " + (amount*2)/100);
        }sc.close();

    }
}
