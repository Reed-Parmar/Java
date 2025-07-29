package Codes;

import java.util.Scanner;

public class Functions_Methods {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // Q: take input of 2 no and print sum
        sum();
        int ans =sum2();
        System.out.println("ans " +ans);
    }
    // return the value
    static int sum2(){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int sum=a+b;
        return sum;
        // anything after return will not be executable
        // System.out.println("Not executable");
    }

    static void sum(){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }

    /*
    SYNTAX OF FUNCTION/METHOD
    access modifier return_type name(){
        //body
        return statement
    }
    */
}