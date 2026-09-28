// Write a program to print the circumference and area of a circle of radius 
// entered by user by defining your own method.
import java.util.Scanner;

public class MCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float r = in.nextFloat();
        System.out.println("Circumference: " + circumference(r));
        System.out.println("Area:" + area(r));
        in.close();
    }
    static double circumference(double r){
        return 2*Math.PI*r;
    }
    static double area(double r){
        return Math.PI*r*r;
    }
}
