package week7homework;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 *
 */
public class Pgrm6OddOrEven {
    public static void main(String[] args) {
        Pgrm6OddOrEven obj = new Pgrm6OddOrEven();
        obj.oddEvenNum();

    }
    public void oddEvenNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number : " );
        int i = sc.nextInt();
        if(i % 2==0){
            System.out.println( i + " is an even number.");
        }else{
            System.out.println( i + " is an odd number. ");
        }sc.close();
    }
}
