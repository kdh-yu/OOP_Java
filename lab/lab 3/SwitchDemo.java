// Lab 3-2 
// Write a program SwitchDemo that prints the output on the next page.
// Create an int type variable numberOfFlavors to store input value.
// The input is an integer between 1 and 32.
// The output is shown when the input is 1, 3, 9, or 32.
// If the input is 2 or 4, the output is the same as the output when the input is 3.
// Otherwise, the output is the same as the output when the input is 9.
// You should use switch statement.

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of ice cream flavors:");
        int numberOfFlavors = in.nextInt();
        switch(numberOfFlavors) {
            case 1:
                System.out.println("I bet it's vanilla.");
                break;
            case 2: case 3: case 4:
                System.out.println(numberOfFlavors + " flavors\nis acceptable.");
                break;
            case 32:
                System.out.println("Nice selection.");
                break;
            default:
                System.out.println("I didn't plan for\n" + numberOfFlavors + " flavors.");
                break;
        }
        in.close();
    }
}
