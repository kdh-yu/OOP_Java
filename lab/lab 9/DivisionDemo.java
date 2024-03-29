import java.util.Scanner;

public class DivisionDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter numerator: ");
            int numerator = in.nextInt();
            System.out.println("Enter denominator: ");
            int denominator = in.nextInt();
            double quotient = safeDivide(numerator, denominator);
            System.out.println(numerator + " / " + denominator + " = " + quotient);
        }
        catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
            secondChance();
        }
        System.out.println("End of program.");
    }

    public static double safeDivide(int top, int bottom) throws DivisionByZeroException{
        if (bottom == 0)
            throw new DivisionByZeroException();
        
            return top/(double)bottom;
    }

    public static void secondChance() {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter a numerator: ");
            int numerator = in.nextInt();
            System.out.println("Enter denominator: ");
            int denominator = in.nextInt();

            double quotient = safeDivide(numerator, denominator);
            System.out.println(numerator + " / " + denominator + " = " + quotient);
        }
        catch(DivisionByZeroException e) {
            System.out.println("I cannot do division by zero.");
            System.out.println("Aborting program.");
            System.exit(0);
        }
    }
}
