import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.print("Enter 2 numbers: ");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int sum=a+b;
        System.out.println("Sum = "+sum);
    }
}