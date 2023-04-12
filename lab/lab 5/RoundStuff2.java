import java.util.Scanner;
import java.lang.Math;

public class RoundStuff2 {

    public static double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    
    public static double volume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius;

        System.out.println("Enter radius: ");
        radius = in.nextDouble();
        System.out.println("A circle of radius " + radius + " inches");
        System.out.println("has an area of " + area(radius) + " square inches.");
        System.out.println("A sphere of radius " + radius + " inches");
        System.out.println("has a volume of " + volume(radius) + " cubic inches.");

        in.close();
    }
}
