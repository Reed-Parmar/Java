package Functions_in_Java;

public class Passing_using_methods {
    public static void main(String[] args) {
        String chacha= "Iron Man";
        greet(chacha);
    }

    static void greet(String naam){
        System.out.println(naam);
    }
}
