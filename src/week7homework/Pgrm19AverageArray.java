package week7homework;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Pgrm19AverageArray {
    public static void main(String[] args) {
        arrayAve();
    }
    public static void arrayAve(){
        int x [] = {5,10,15,20,25,30,35,40,45,50};
        int sum = 0;
        int length = x.length;
        for(int i =0;i<x.length;i++){
            sum = sum+ x[i];
        }
        double ave = sum/length;
        System.out.println("Average value of array elements  : " + ave);
    }
}
