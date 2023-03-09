// Lab 2-4
// Write a program SelfService that prints the output in the next page.
// Create two variables count and price to store input values,
// and a variable total to store the value calculated by the following equation.
// total = count * price

import java.util.Scanner;

public class SelfService {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of items purchased");
        System.out.println("followed by the cost of one item.");
        System.out.println("Do not use a dollar sign.");

        int count = in.nextInt();
        double price = in.nextDouble();
        double total = count * price;

        System.out.println(count + " items at $" + price + " each.");
        System.out.printf("Total amount due $%.2f.", total);
        System.out.println("Please take your merchandise.");
        System.out.printf("Place $%.2f in an envelope", total);
        System.out.println("and slide it under the office door.");
        System.out.println("Thank you for using the self-service line.");

        in.close();

    }
}
