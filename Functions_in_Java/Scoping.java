package Functions_in_Java;

public class Scoping {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        {
            // int a=87; // a is already initialised in the same method before
            a =87; // value of a can be changed as a was initialised before this block started
            int c = 65;
        }
        // System.out.println(c); // c is not in the scope as it was initialised in the block scope

        // scoping in for loop
        for(int i=0;i<5;i++){
            System.out.println(i);
            int num=10;
            a =55;
            System.out.println(num+" "+a);
        }
        // System.out.println(i);
    }
    static void random(){
        //System.out.println(a); // a is not in the scope of random function
        int num =90;
        System.out.println(num);//num is in the scope of random function
    }
}
