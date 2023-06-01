import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 0;
        boolean done = false;
        
        while (!done) {
            try {
                System.out.println("Enter a whole number: ");
                number = in.nextInt();
                done = true;
            }
            catch(InputMismatchException e) {
                in.nextLine();
                System.out.println("Not a correctly written whole number.");
                System.out.println("Try again.");
            }
        }
        System.out.println("You entered " + number);
    }
}
