// Lab 3-4
// Write a program WhileDemo that prints the output on the next page.
// Create an int type variable countDown whose initial value of the first loop is 3,
// and initial value of the second loop is 0.
// You should use while statement and do-while statement.

public class WhileDemo {
    public static void main(String[] args) {
        int countDown;

        System.out.println("First while loop: ");
        countDown = 3;
        while (countDown > 0) {
            System.out.println("Hello");
            countDown--;
        }

        System.out.println("Second while loop: ");
        countDown = 0;
        while (countDown > 0) {
            System.out.println("Hello");
            countDown--;
        }

        System.out.println("First do-while loop: ");
        countDown = 3;
        do {
            System.out.println("Hello");
            countDown--;
        } while (countDown > 0);

        System.out.println("Second do-while loop: ");
        countDown = 0;
        do {
            System.out.println("Hello");
            countDown--;
        } while (countDown > 0);
    }
}
