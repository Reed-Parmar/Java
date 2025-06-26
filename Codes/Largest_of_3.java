package Codes;

import java.util.Scanner;

public class Largest_of_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a=input.nextInt();  
        int b=input.nextInt();
        int c=input.nextInt(); 
        //Q: Find the largest of 3 numbers
        if(a>b){
            if(a>c){
                System.out.println(a+" is the largest");
            }
            else{
                System.out.println(c+" is the largest");
            }
        }
        else{
            if(b>c){
                System.out.println(b+ " is the largest");
            }
            else{
                System.out.println(c+" is the largest");
            }
        }
        int max=Math.max(c,Math.max(a,b));
        System.out.println(max); 
    }
}
