package Codes;

public class Type_Casting {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        float num=input.nextFloat();
        System.out.println(num);

        //Type casting 
        // Converting a bigger number in a smaller type explicitely
        int num=(int)(678.354);
        System.out.println(num);

        int a=(byte)(382);
        System.out.println(a);
        
        //automatic type promotion in expressions
        int b=257;
        byte c= (byte)(b);// 257 % 256 = 1
        System.out.println(c);
        byte x=40;
        byte y=50;
        byte z=100;
        byte d=(byte)(x*y/z);
        System.out.println(d);
        */
        byte b=42;
        char c ='a';
        short s=1024;
        int i=50000;
        float f=5.67f;
        double d=0.1234;
        double result=(f*b)+(i/c)-(d*s);
        System.out.println((f*b)+ " "+ (i/c)+ " "+(d*s));
        // float + int - double = double
        System.out.println(result); 


    }
}
