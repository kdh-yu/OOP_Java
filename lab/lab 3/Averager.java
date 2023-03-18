// Lab 3-5
// Write a program Averager that prints the output on the next page.
// The program calculates the average of scores entered.
// If the score is not entered, it shows “No scores entered.”.
// Otherwise, consult the output on the next page.


import java.util.Scanner;

public class Averager {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a list of nonnegative scores.");
        System.out.println("Mark the end with a negative number.");
        System.out.println("I will compute their average.");

        double next, sum = 0;
        int cnt = 0;

        next = in.nextDouble();
        while (next >= 0) {
            sum += next;
            cnt++;
            next = in.nextDouble();
        }

        if (cnt == 0) {
            System.out.println("No scores entered.");
        } else {
            double average = sum / cnt;
            System.out.println(cnt + " scores read.");
            System.out.println("The average is " + average + ".");
        }

        in.close();
    }
}
