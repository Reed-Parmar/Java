package Assignments;

import java.util.Scanner;

public class Subtract_the_product_and_sum_of_digits_of_an_integer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n =in.nextInt();
        int sum=0,mul=1,result=0;
        while(n>0){
            int temp=n%10;
            sum+=temp;
            mul*=temp;
            n/=10;
        }
        result=mul-sum;
        System.out.println(result);
    }
}
