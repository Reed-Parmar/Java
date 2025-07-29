package Codes;

import java.util.Scanner;

public class Return_String {
    public static void main(String[] args) {
        String msg=name();
        System.out.println(msg);
    }
    static String name(){
        Scanner in=new Scanner(System.in);
        String a="Hello sir";
        return a;
    }
}