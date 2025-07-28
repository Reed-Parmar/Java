package Codes;

import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int id=in.nextInt();
        String dept=in.next();

        // enhanced switch method
        switch (id) {
            case 1 -> System.out.println("Kunal");
            case 2 -> System.out.println("Reed");
            case 3 -> {
                switch (dept) {
                    case "IT" -> System.out.println("IT dept");
                    case "CS" -> System.out.println("CS dept");
                }
            }
        }


        // old switch method
        switch(id){
            case 1:
                System.out.println("Kunal");
                break;
            case 2:
                System.out.println("Reed");
                break;
            case 3:
                switch(dept){
                    case "IT":
                        System.out.println("IT dept");
                        break;
                    case "CS":
                        System.out.println("CS dept");
                        break;
                }
        }
    }
}
