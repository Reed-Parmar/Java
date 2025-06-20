package Assignments;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.print("Enter name: ");
        Scanner input= new Scanner(System.in);
        String name = input.next();
        if(name=='Reedham'){
            System.out.println("Welcome");
        }
    }

}
