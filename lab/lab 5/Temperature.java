import java.util.Scanner;

public class Temperature {
    private double degrees;

    public Temperature() {
        this.degrees = 0;
    }
    public Temperature(double degrees) {
        this.degrees = degrees;
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }
    public double getDegrees() {
        return this.degrees;
    }
    public String toString() {
        return this.degrees + "°C";
    }
    public boolean equals(Temperature otherTemperature) {
        return (this.degrees == otherTemperature.degrees);
    }
    public static double toCelsius(double degreesF) {
        return 5 * (degreesF - 32) / 9;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Temperature tem = new Temperature();
        System.out.println("Enter degrees Fahrenheit:");
        double degree;
        degree = in.nextDouble();
        tem.setDegrees(toCelsius(degree));
        System.out.println("Equivalent Celsius temperature is " + tem.toString());
        in.close();
    }
}
