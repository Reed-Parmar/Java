import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        int i=0;
        for(i=0;i<T;i++){
            int N=in.nextInt();
            int sum=0;
            for(int j=0;j<N;j++){

                int A=in.nextInt();
                sum=sum+A;
            }
            float avg=0;
            avg=sum/N;
            if(avg>=40){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}