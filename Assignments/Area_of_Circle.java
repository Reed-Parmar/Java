package Assignments;

import java.util.Scanner;

public class Area_of_Circle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        float r=in.nextFloat();
        double area=3.14*r*r;
        System.out.println("Area = "+area);
    }
}
