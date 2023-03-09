// Lab 2-5
// Write a program DelimiterDemo that prints the output below.
// Create variables word1, word2 and junk to store input appropriately.
// You should use method useDelimiter().

import java.util.Scanner;

public class DelimiterDemo {
    public static void main(String[] args) {
        Scanner keyboard1 = new Scanner(System.in);
        Scanner keyboard2 = new Scanner(System.in).useDelimiter("##");
        System.out.println("Enter a line of text:");
        String word1 = keyboard1.next();
        String word2 = keyboard1.next();

        System.out.println("For keyboard1 the two words read are:");
        System.out.println(word1);
        System.out.println(word2);

        String junk = keyboard1.nextLine();  // Not used

        System.out.println("Re-enter the same line of text:");
        word1 = keyboard2.next();
        word2 = keyboard2.next();
        
        System.out.println("For keyboard2 the two words read are:");
        System.out.println(word1);
        System.out.println(word2);

        keyboard1.close();
        keyboard2.close();
    }
}
