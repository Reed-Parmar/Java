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
        /*for(int i=1;i<n;i++){
            result=a+b;
            System.out.println(result);
            int temp=a;
            a=b;
            b=result;
        }*/
        int i=1;
        while(i<n){
            result=a+b;
            System.out.println(result);
            int temp=a;
            a=b;
            b=result;
            i++;
        }
        System.out.println("nth fibonnaci number is "+result);
    }
}
