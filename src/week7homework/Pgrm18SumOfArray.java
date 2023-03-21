package week7homework;
/**
 * Write a Java program to sum values of an array.
 */

public class Pgrm18SumOfArray {
    public static void main(String[] args) {
       sumArray();
    }
    public static void sumArray(){
        int a [] = {2,4,6,8,10};
        int sum =0;

        for(int i =0;i < a.length;i++){
          sum= sum + a[i];
        }
        System.out.println("Sum of all given arrays  " + sum);

    }
}
