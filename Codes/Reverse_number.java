package Codes;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        while (n > 0) {
            int temp = n % 10;
            n /= 10;
            result=result*10+temp;
        }
        System.out.println(result);
    }
}
