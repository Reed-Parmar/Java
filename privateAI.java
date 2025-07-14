public class privateAI {
    public static void main(String[] args) {
        int n = 10; // change this value to test different numbers
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            a = b;
            b = a + b;
        }
    }
}