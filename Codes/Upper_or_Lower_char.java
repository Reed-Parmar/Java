package Codes;

import java.util.Scanner;

public class Upper_or_Lower_char {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        System.out.println(ch);
        if(ch>='a' && ch<='z'){
            System.out.println("Entered is lower case");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Entered is upper case");
        }
    }
}