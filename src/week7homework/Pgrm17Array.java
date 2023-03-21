package week7homework;
import java.util.Arrays;
/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Pgrm17Array {
    public static void main(String[] args) {
        Pgrm17Array obj = new Pgrm17Array();
        obj.sortArray();
    }
    public void sortArray(){
        int[] num={-9,12,-6,22,100};
        String[] str={"Sun", "Moon", "Star","Car"," Bike"};

        Arrays.toString(num);
        Arrays.toString(str);


        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(str));

        Arrays.sort(num);
        Arrays.sort(str);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(str));


    }
}
