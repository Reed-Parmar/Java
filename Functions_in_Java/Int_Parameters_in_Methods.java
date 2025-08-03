package Functions_in_Java;

import java.util.Scanner;

public class Int_Parameters_in_Methods {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int ans1=sum(7,8); // predefined input
        int ans2=sum(/*a*/in.nextInt(),/*b*/in.nextInt()); // user input
        System.out.println(ans1);
        System.out.println(ans2);
    }
    static int sum(int a,int b){
        int sum =a+b;
        return sum;
    }
}
