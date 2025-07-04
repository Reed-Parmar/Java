package Assignments;

import java.util.Scanner;

public class Area_of_Rectangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter lengths of sides of Rectangle: ");
        float a=in.nextFloat();
        float b=in.nextFloat();
        double area=a*b;
        System.out.println(area);
    }
}
