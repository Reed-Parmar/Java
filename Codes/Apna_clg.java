package Codes ;

import java.util.Scanner;

public class Apna_clg{
    public static void main(String[] args) {
        //output
        System.out.print("Hello World");
        System.out.println("\nHello World");
        //variables
        String name= "TONAY STARK";
        int a=5;
        int b=10;
        System.out.println(name);
        int sum=a-b;
        System.out.println(sum);
        //input
        //nextInt
        //nextFloat
        System.out.println("hello");
        System.out.println("Enter 2 numbers: ");
        try (Scanner sc = new Scanner(System.in)) {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int hii=x+y;
            System.out.println(hii);
        }
    }
}