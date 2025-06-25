package Assignments;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle (P): ");
        float P=input.nextFloat();
        System.out.print("Enter Time Period (T): ");
        float T=input.nextFloat();
        System.out.print("Enter Rate of Interest in years (R): ");
        float R=input.nextFloat();
        float result=P*T*R/100;
        System.out.println("Interest= "+ result);
        float total= P+ result;
        System.out.println("Total money owed at end of time period= "+ total);
    }
}
