package Codes;

import java.util.Scanner;

public class Counting_Occurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();//i need to % n by 10 and have it not be = to 0
        int count=0;       // then count will be the number of digits in n
        while(n>0){
            int temp=n%10;
            if(temp==5){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);

    }
}
