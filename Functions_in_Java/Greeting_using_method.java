package Functions_in_Java;

public class Greeting_using_method {
    public static void main(String[] args) {
        String greet1=greeting1("hello world");
        String greet2=greeting2();
        System.out.println(greet1);
        System.out.println(greet2);
    }
    static String greeting1(String a){
        return a;
    }
    // inline value for parameter a
    static String greeting2(){
        return "hello world";
    }
}
