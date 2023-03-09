// Lab 2-3
// Write a program ScannerDemo2 that prints the output in the next page.
// Create variables n1, n2, d1, d2, word1, word2, junk, and line
// to store input appropriately. 

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two whole numbers");
        System.out.println("seperated by one or more spaces:");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.printf("You entered %d and %d\n", n1, n2);

        System.out.println("\nNext enter two numbers.");
        System.out.println("A decimal point is OK.");
        double d1 = in.nextDouble();
        double d2 = in.nextDouble();
        System.out.println("You entered " + d1 + " and " + d2);

        System.out.println("\nNext enter two words:");
        String word1 = in.next();
        String word2 = in.next();
        System.out.printf("You entered \"%s\" and \"%s\"\n", word1, word2);

        String junk = in.nextLine(); // Not used

        System.out.println("\nNext enter a line of text:");
        String line = in.nextLine();
        System.out.printf("You entered \"%s\"\n", line);

        in.close();
    }
}
