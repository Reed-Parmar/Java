package Assignments;

import java.util.Scanner;

public class Perimeter_Circle {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter radius: ");
        float r=in.nextFloat();
        double c=3.14*2*r;
        System.out.println(c);
    }
}
