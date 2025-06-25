package Assignments;

import java.util.Scanner;

public class Currency_Exchange {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter currency in rupees: ");
        float R=input.nextFloat();
        float D=R/80;
        System.out.println(D);
    }

}
