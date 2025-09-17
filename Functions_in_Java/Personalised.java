package Functions_in_Java;

import java.util.Scanner;

public class Personalised {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        System.out.print("Enter your name: ");
       String naam=in.next();
       String a=greet(naam);
       String b=greet2(naam);
        System.out.println(a+"\n"+b);
    }
    static String greet(String name){
        String message = "Hello "+name;
        return message;
    }
    static String greet2(String name){
        String greet="How are you today "+ name;
        return greet;
    }
}
