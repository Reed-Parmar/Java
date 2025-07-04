package Assignments;

import java.util.Scanner;

public class Vol_Cone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of base of cone: ");
        float r=in.nextFloat();
        System.out.println("Enter height of cone: ");
        float h=in.nextFloat();
        double vol=3.14*r*r*h/3;
        System.out.println(vol);
    }
}
