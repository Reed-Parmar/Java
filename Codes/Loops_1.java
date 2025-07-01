package Codes;

import java.util.Scanner;

public class Loops_1 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Scanner input = new Scanner(System.in);
        /*
        syntax of for loop
        for(initialisation;condition;increment/decrement){
        //body
        } 
         */
        //Q: Print numbers from 1 to 5
        for(int i=1;i<=5;i++){
            System.out.println(i);
        } 
        /*
         while loop
         Syntax:
         while(condition){
         // body
         }
        */
        int num =1;
        while(num<=5){
            System.out.println(num);
            num++;
        }
        /*
        USE WHILE LOOP WHEN YOU DON'T KNOW HOW MANY TIMES THE LOOP WILL RUN
        USE FOR LOOP WHEN YOU KNOW HOW MANY TIMES THE LOOP WILL RUN
         */
        /*String ch;
        ch=input.next();
        while(ch=="x"){
            System.out.println("NOO");
            ch=input.next();
        }
        System.out.println("YESS");*/
        /*
        do while condition
        Syntax:
        do{
        // body
        }while(condition)
        */
        int n=1;
        do{System.out.println(n);
            n++;
        }while(n<=5);
        
    }
}
