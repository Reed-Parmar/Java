package Assignments;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=input.nextInt();
        int a=0;
        int b=1;
        int i=0;
        System.out.println(i+1+". "+a);
        for(i =0;i<=n;i++){
            System.out.println(i+2+". "+b);
            int temp=b;
            b=a+b;
            a=temp;
        }     
    }
}
