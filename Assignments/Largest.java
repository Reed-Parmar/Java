package Assignments;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter 2 numbers: ");
     float a=input.nextFloat();
     float b=input.nextFloat();
     if(a>b){
        System.out.println(a+" is greater");
     }   
     if(a<b){
        System.out.println(b+" is greater");
     }
     if(a==b){
        System.out.println("Both are equal");
     }
    }
}
