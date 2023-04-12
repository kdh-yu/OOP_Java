import java.util.Scanner;

public class RoundStuffDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius;

        System.out.println("Enter radius: ");
        radius = in.nextDouble();
        System.out.println("A circle of radius " + radius + " inches");
        System.out.println("has an area of " + RoundStuff.area(radius) + " square inches.");
        System.out.println("A sphere of radius " + radius + " inches");
        System.out.println("has a volume of " + RoundStuff.volume(radius) + " cubic inches.");

        in.close();
    }
}
