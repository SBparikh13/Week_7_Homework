package week7homework;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math,
 * Science and English marks (marks is between 0 to 100 and if it is out of range
 * print error message “Invalid Input, Marks should between 0 to 100”) and find out total,percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C
 * And print Mark Sheet in following format _______________________________ | |
 * |             Mark Sheet       |
 * |_______________________________|
 * | Name     :                Jay |
 * | Roll No  :                 08 |
 * |_______________________________|
 * | Subjects :              Marks |
 * |_______________________________|
 * | Math     :                 98 |
 * | Science  :                 90 |
 * | English  :                 85 |
 * |_______________________________|
 * | Total    :                273 |
 * |_______________________________|
 * | Percentage :             91.0 |
 * | Result     :             Pass |
 * | Grade      :               A+ |
 * |_______________________________|
 */

public class Pgrm3MarkSheet {
    public static void main(String[] args) {
        Pgrm3MarkSheet obj = new Pgrm3MarkSheet();
        obj.markSheet();

    }
    static String result;
    static String grade;
    public void markSheet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name  : ");
        String name = sc.nextLine();
        System.out.println("Enter student roll number : ");
        int rollnum = sc.nextInt();
        System.out.println("Enter Maths Marks: ");
        int mathmarks = sc.nextInt();
        if (mathmarks>0&&mathmarks<=100) {
        }else{
            System.out.println("Invalid input ");
        }
        System.out.println("Enter English Marks :");
        int engmarks = sc.nextInt();
        if (engmarks>0&&engmarks<= 100) {
        }else{
            System.out.println("Invalid input ");
        }
        System.out.println("Enter Science Marks : ");
        int scimarks = sc.nextInt();
        if (scimarks>0&&scimarks<=100) {
        }else{
            System.out.println("Invalid input");
        }
        int total = mathmarks + engmarks + scimarks;
        System.out.println(" Total Marks : " + total);
        int percentage = ((total*100)/300);
        System.out.println("Percentage  : " + percentage);

        if(percentage>=35&&percentage<=50){
           result = "Pass";
           grade = "Grade C";
        }else if(percentage>=50&&percentage<=60){
            result = "Pass";
             grade = "Grade B";
        }else if(percentage>=60&&percentage<=80){
             result = "Pass";
            grade = "Grade A";
        }else if(percentage>=80&&percentage<=100){
            result = "Pass";
            grade = "Grade A+";
        } else{
            result= "Fail";
            grade = "Grade D ";
        }

        System.out.println("-----------------------------------");
        System.out.println("|       Mark Sheet                |");
        System.out.println("|_________________________________|");
        System.out.println("|   Name      :       " +name+   "|");
        System.out.println("|   Roll No   :       "+rollnum+ "|");
        System.out.println("|_________________________________|");
        System.out.println("|   Subjects  :          Marks    |");
        System.out.println("|_________________________________|");
        System.out.println("|   Math      :      "+mathmarks+"|");
        System.out.println("|   Science   :       "+scimarks+"|");
        System.out.println("|   English   :       "+engmarks+"|");
        System.out.println("|_________________________________|");
        System.out.println("|   Total     :          "+total+"|");
        System.out.println("|_________________________________|");
        System.out.println("|   Percentage:     "+percentage+"%"+"|");
        System.out.println("|   Result    :     "  +result  +      "|");
        System.out.println("|   Grade     :      "+  grade +        "|");
        System.out.println("|_________________________________|");



    }

}


