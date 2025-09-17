import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] name= new int[5];
        for(int i=0;i<5;i++){
            name[i]=in.nextInt();
            System.out.println(name[i]);
        }
    }
}
