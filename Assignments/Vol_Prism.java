package Assignments;

import java.util.Scanner;

public class Vol_Prism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter height of prism: ");
        float h=in.nextFloat();
        System.out.println("enter area of base: ");
        float area = in.nextFloat();
        double vol=area*h;
        System.out.println(vol);
    }
}
