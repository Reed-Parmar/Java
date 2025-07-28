package Assignments;

import java.util.Scanner;

public class Input_till_0_is_entered_Print_largest_of_all_numbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        while(a!=0 && b!=0){
            if(a>b){
                b=in.nextInt();
            }else{
                a=in.nextInt();
            }
        }
        System.out.println(a);
    }
}
