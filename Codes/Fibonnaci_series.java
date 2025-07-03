package Codes;

import java.util.Scanner;

public class Fibonnaci_series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.print("Enter the number of digits: ");
        int n =input.nextInt();
        System.out.println(a);
        System.out.println(b);
        int result=0;
        for(int i=0;i<=n;i++){
            result=a+b;
            System.out.println(result);
            int temp=a;
            a=b;
            b=result;
        }
    }
}
