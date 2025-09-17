package Clg;
import java.util.Scanner;
public class Java_Exp_1 {
public static void main(String[] args) {
            Scanner in= new Scanner(System.in);
            System.out.print("Enter Employee Number: ");
            int empNo =in.nextInt();
            System.out.print("Enter Employee Name: ");
            String empName=in.next();

            System.out.print("Enter Salary: ");
            double basic=in.nextDouble();
            double da = 0.70 * basic;
            double hra = 0.30 * basic;
            double cca = 240.0;
            double pf = 0.10 * basic;
            double pt = 100.0;

            double grossSalary = basic + da + hra + cca;
            double netSalary = grossSalary - pf - pt;

            System.out.println("Gross salary= "+ grossSalary);
            System.out.println("Net salary= "+ netSalary);
        }
    }
