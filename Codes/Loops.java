package Codes;
public class Loops {
    public static void main(String[] args) {
        if(true){
            System.out.println("true");
        }
        int count=0;
        while(count<=5){
            System.out.print(count+",");
            count++;
        }
        System.out.println(" ");
        for(count=0;count<=5;count++){
            System.out.print(count+",");
        }
    }

}
