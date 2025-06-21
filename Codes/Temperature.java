package Codes;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float C=input.nextFloat();
        float f=(C*9/5)+32;
        System.out.println(f);
    }

}
