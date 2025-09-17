package Clg;
import java.io.*;
class Area { 
    private double length;
    private double breadth;

    void setDim(double l, double b) {
        length = l;
        breadth = b;
    }

    double getArea() {
        return length * breadth;
    }
}

public class Java_Exp_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the length of the rectangle: ");
        double length = Double.parseDouble(br.readLine()); 

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = Double.parseDouble(br.readLine());

        Area rectangle = new Area(); 
        rectangle.setDim(length, breadth); 

        System.out.printf("The area of the rectangle is: %.2f", rectangle.getArea());
    }
}