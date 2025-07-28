package Codes;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fruit =in.next();


        switch (fruit) { // enhanced switch statement alt+enter
            case "Mango" -> System.out.println("KING");
            case "Apple" -> System.out.println("RED");
            case "Tomato" -> System.out.println("Not a fruit!");
            default -> System.out.println("Enter a valid fruit!");
        }


        // Push down switch statement alt+enter
        System.out.println(switch (fruit) {
            case "Mango" -> "KING";
            case "Apple" -> "RED";
            case "Tomato" -> "Not a fruit!";
            default -> "Enter a valid fruit!";
        });


        switch (fruit) { // old switch statement
            case "Mango":
                System.out.println("KING");
                break;
            case "Apple":
                System.out.println("RED");
                break;
            case "Tomato":
                System.out.println("Not a fruit!");
                break;
            default:
                System.out.println("Enter a valid fruit!");
                break;
        }


    }
}
