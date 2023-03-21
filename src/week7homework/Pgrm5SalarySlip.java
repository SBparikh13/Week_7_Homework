package week7homework;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10% DA = Basic salary 8% TA = Basic salary 9% PF= Basic salary 20% Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format _______________________________
 *                           |             Salary Slip     |
 *                           |______________________________|
 *                           | Employee Id :           2564 |
 *                           | Employee Name :          Jay |
 *                           |______________________________|
 *                           | Basic Salary :       25000.0 |
 *                           | HRA 10% :             2500.0 |
 *                           | TA 8% :               2250.0 |
 *                           | DA 9% :               2000.0 |
 *                           | PF - 20& :            5000.0 |
 *                           |______________________________|
 *                           | Gross Salary :       26750.0 |
 *                           |===========================|
 */

public class Pgrm5SalarySlip {
    public static void main(String[] args) {
        Pgrm5SalarySlip obj = new Pgrm5SalarySlip();
        obj.salarySlip();

    }

    public void salarySlip(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Employee ID :      ");
        int empID = sc.nextInt();
        System.out.println("Enter an Employee Name :     ");
        String empname = sc.next();
        System.out.println("Enter basic salary:        ");
        double basicsalary = sc.nextDouble();
        double HRA = (basicsalary*10)/100;
        double DA = (basicsalary*8)/100;
        double TA = (basicsalary*9)/100;
        double PF = (basicsalary*20)/100;
        double grosssalary = basicsalary+HRA+DA+TA-PF;
        System.out.println("--------------------------------------------------------");
        System.out.println("|                           Salary Slip                |");
        System.out.println("--------------------------------------------------------");
        System.out.println("|Employee ID             :         "           +   empID  + "|");
        System.out.println("|Employee Name           :         "           +  empname  +"|");
        System.out.println("-------------------------------------------------------------|");
        System.out.println("|Basic Salary            :         "         +basicsalary+"|");
        System.out.println("|HRA 10%                 :         "           +HRA        +"|");
        System.out.println("|TA 8%                   :         "           +TA         +"|");
        System.out.println("|DA 9%                   :         "           +DA         +"|");
        System.out.println("|PF 20%                  :         "           +PF         +"|");
        System.out.println("|-------------------------------------------------------|");
        System.out.println("|Gross Salary            :         "      +grosssalary+"|");
        System.out.println("|=======================================================|");
sc.close();
    }

}