package week7homework;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Pgrm12FindNoAlphaSymbol {
    public static void main(String[] args) {
        Pgrm12FindNoAlphaSymbol obj = new Pgrm12FindNoAlphaSymbol();
        obj.findOut();

    }
    public  void findOut(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a character ");
         char ch = sc.next().charAt(0);
        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) {
            System.out.println("This is an alphabet. ");
        }else if(ch>='0' && ch<='9'){
            System.out.println("This is a digit.");
        }else{
            System.out.println("This is a symbol ");

        }sc.close();
    }

}
