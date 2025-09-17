package Clg;

import java.util.Scanner;
public class Java_Exp_2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the operation you want to use: ");
        System.out.print("1. factorial\n2. armstrong\n3. palindrome\n4. prime\n5. fibonacci\nChoice: ");
        int a = sc.nextInt();
        do{
        switch (a) {
            case 1:
                factorial();
                break;
            case 2:
                armstrong();
                break;
            case 3:
                palindrome();
                break;
            case 4:
                prime();
                break;
            case 5:
                fibonacci();
                break;
            case 6:
                System.out.println("Exiting the program.");
            default:
                System.out.print("Enter a valid choice.");
        }
    }while (a != 6);
    }

    static void factorial() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }

    static void armstrong() {
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int x = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        if (sum == x) {
            System.out.println("True (Armstrong number)");
        } else {
            System.out.println("False (Not an Armstrong number)");
        }
    }

    static void palindrome() {
        System.out.print("Enter a number: ");
        int no = sc.nextInt();
        int x = no;
        int sum = 0;
        while (no > 0) {
            int temp = no % 10;
            sum = sum * 10 + temp;
            no /= 10;
        }
        if (sum == x) {
            System.out.println("True (Palindrome)");
        } else {
            System.out.println("False (Not a Palindrome)");
        }
    }

    static void prime() {
        System.out.print("Enter a number: ");
        int nm = sc.nextInt();
        if (nm <= 1) {
            System.out.println("False (Not Prime)");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(nm); i++) {
            if (nm % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("True (Prime)");
        } else {
            System.out.println("False (Not Prime)");
        }
    }

    static void fibonacci() {
        System.out.print("Enter number of terms: ");
        int nv = sc.nextInt();
        int x = 0, y = 1;
        System.out.print("Fibonacci Series: " + x + " " + y);
        for (int i = 2; i < nv; i++) {
            int as = x + y;
            System.out.print(" " + as);
            x = y;
            y = as;
        }
        System.out.println();
    }
}