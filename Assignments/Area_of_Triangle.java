package Assignments;

import java.util.Scanner;

public class Area_of_Triangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter height and base of Triangle: ");
        float h=in.nextFloat();
        float b=in.nextFloat();
        double area=h*b/2;
        System.out.println(area);
    }
}
