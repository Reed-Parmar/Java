package Assignments;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        float a=input.nextFloat();
        float b=input.nextFloat();
        System.out.print("Enter operator (+,-,*,/): ");
        String op=input.next();
        float result;
        if("+".equals(op)){
            result=a+b;
            System.out.println(result);
        }
        if("-".equals(op)){
            result=(a-b);
            System.out.println(result);
        }
        if("*".equals(op)){
            result=a*b;
            System.out.println(result);
        }
        if("/".equals(op)){
            if(b!=0 && a!=0){
                result=a/b;
                System.out.println(result);
            }
            if(a==0){
                System.out.println("0");
            }
            if(b==0){
                System.out.println("Invalid input");
            }
        }
    }
}
