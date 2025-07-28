package Assignments;

import java.util.Scanner;

public class Input_till_0_is_entered_Print_sum_of_all_numbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        while(n!=0){
            sum+=n;
            n=in.nextInt();
        }
        System.out.println(sum);
    }
}
