// Lab 3-6
// Write a program Averager2 that prints the output on the next page using a For statement.
// The program calculates the average of scores entered.
// If the score is not entered, it shows “No scores entered.”.
// Otherwise, consult the output on the next page.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Averager2 {
    public static void main(String[] args) {
        double sum = 0, score;
        int cnt = 0;
        Scanner in = new Scanner(System.in);
        boolean result = true;

        System.out.println("Enter the number of nonnegative scores.");
        cnt = in.nextInt();

        System.out.println("Enter a list of " + cnt + " nonnegative scores.");
        System.out.println("I will compute their average.");

        for (int i=0; i<cnt; i++) {
            try {
                score = in.nextDouble();
                sum += score;
            } catch (InputMismatchException e) {
                System.out.println("No scores entered.");
                result = false;
                break;
            }
        }
        if (result) {
            double average = sum / cnt;
            System.out.println("The average is " + average + ".");
        }

        in.close();
    }

}
