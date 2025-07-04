package Assignments;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Area_of_Isosceles_Triangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter side which is equal to each other (a): ");
        float a=in.nextFloat();
        System.out.print("Enter the abnormal side (b): ");
        float b= in.nextFloat();
        double area=0.25*b*sqrt(4*a*a-b*b);
        System.out.println(area);
    }
}
