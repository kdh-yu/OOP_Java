// Lab 3-1
// Write a program IncomeTax that prints the output on the next page.
// Create a double type variable netIncome to store input value.
// Create a double type variable tax to store the calculated tax.
// This program computes state income tax according to the following rate schedule:
//      1. No tax is paid on the first $15,000 of net income.
//      2. A tax of 5% is assessed on each dollar of net income from $15,001 to $30,000.
//      3. A tax of 10% is assessed on each dollar of net income over $30,000
// You should use if-else statement.

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double netIncome, tax = 0;
        System.out.println("Enter net income.");
        System.out.println("Do not include a dollar sign or any commas.");
        netIncome = in.nextDouble();
        
        if (netIncome <= 15000) {
            tax = 0;
        } else if (netIncome > 15000 && netIncome <= 30000) {
            tax = (netIncome - 15000) * 0.05;
        } else if (netIncome > 30000) {
            tax = 15000 * 0.05 + (netIncome - 30000) * 0.1;
        }
        System.out.printf("Tax due = $%.2f\n", tax);

        in.close();
    }
}
