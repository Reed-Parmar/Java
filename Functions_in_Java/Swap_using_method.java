package Functions_in_Java;

public class Swap_using_method {
    public static void main(String[] args) {
        swap(10,20);
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
