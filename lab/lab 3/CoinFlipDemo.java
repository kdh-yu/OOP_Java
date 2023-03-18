// Lab 3-7
// Write a program CoinFlipDemo that prints the output on the next page.
// Do the following step five times.
// step> Create an int type variable coinFlip to store a randomly generated integer among 0 or 1.
// If the coinFlip is 1, print "Heads". Otherwise, print "Tails".
// You should use the Random class.

import java.util.Random;

public class CoinFlipDemo {
    public static void main(String[] args) {
        Random rdn = new Random();
        String state;

        for (int i=0; i<5; i++) {
            int coinFlip = rdn.nextInt(2);
            if (coinFlip == 1) {
                state = "Heads";
            } else {
                state = "Tails";
            }

            System.out.println("Flip number " + (i+1) + ": " + state);
        }

    }
}
