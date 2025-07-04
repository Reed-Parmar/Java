package Assignments;

import java.util.Scanner;

public class Perimeter_Eq_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter side of triangle: ");
        float a= in.nextFloat();
        double P=3*a;
        System.out.println(P);
    }
}
