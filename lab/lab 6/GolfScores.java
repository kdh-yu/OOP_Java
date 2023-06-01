import java.util.Scanner;

public class GolfScores {
    public static final int MAX_NUMBER_SCORES = 10;

    public static void main(String[] args) {
        double[] score = new double[MAX_NUMBER_SCORES];
        int numberUsed;

        System.out.println("This program reads golf scores and shows");
        System.out.println("how much each differs from the average.");
        System.out.println("Enter golf scores:");
        numberUsed = fillArray(score);
        showDifference(score, numberUsed);
    }

    public static int fillArray(double[] a) {
        System.out.println("Enter up to 10 nonnegative numbers.");
        System.out.println("Mark the end of the list with a negative number.");

        double next;
        int index = 0;
        Scanner in = new Scanner(System.in);
        do {
            next = in.nextDouble();
            if (next >= 0)
                a[index++] = next;
        } while (next >= 0 && index < a.length);
        
        if (next >= 0)
            System.out.println("Could only read  in " + a.length + " input values.");

        in.close();
        return index;
    }

    public static double computeAverage(double[] a, int numUsed) {
        double total = 0;
        if (numUsed > 0) {
            for (int i=0; i<a.length; i++)
                total += a[i];
            return total / numUsed;
        }
        else {
            System.out.println("ERROR: Trying to average 0 numbers.");
            System.out.println("computeAverage returns -1.");
            return -1;
        }
    }
    public static void showDifference(double[] a, int numUsed) {
        double average = computeAverage(a, numUsed);
        if (average >= 0) {
            System.out.println("Average of " + a.length + " scores = " + average);
            System.out.println("The scores are:");
            for (int i=0; i<a.length; i++) {
                System.out.println(a[i] + " differs from average by " + (a[i] - average));
            }
        }
        
    }
}
