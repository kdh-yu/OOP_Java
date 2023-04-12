import java.lang.Math;

public class RoundStuff {
    private static final double PI = 3.14159;

    public static double area(double radius) {
        return PI * Math.pow(radius, 2);
    }
    
    public static double volume(double radius) {
        return (4.0 / 3.0) * PI * Math.pow(radius, 3);
    }
}
