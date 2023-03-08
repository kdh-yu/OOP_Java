// Lab 1-3
// Write a program ShowInterest that prints the output below.
// Create a named constant INTEREST_RATE whose value is 2.5, a variable balance whose value is 100.0,
// and a variable interest which stores the value calculated by the following equation.
// interest = balance * (INTEREST_RATE / 100.0);

public class ShowInterest {
    public static final double INTEREST_RATE = 2.5;

    public static void main(String[] args) {
        double balance = 100;
        double interest = balance * (INTEREST_RATE / 100.0);
        System.out.printf("On a balance of $%.1f\n", balance);
        System.out.printf("You will earn interest of $%.1f\n", interest);
        System.out.println("All in just one short year.");

    }
}
