import java.util.Scanner;

public class Bill {
    public static double RATE = 150.00;
    private int hours, minutes;
    private double fee = 0;

    public void inputTimeWorked() {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter number of full hours worked");
        System.out.println("followed by number of minutes:");
        hours = in.nextInt();
        minutes = in.nextInt();

        in.close();
    }

    private double computeFee(int hoursWorked, int minutesWorked) {
        int minutesTotal = hoursWorked * 60 + minutesWorked;
        double feeTotal = minutesTotal / 15 * RATE;
        return feeTotal;
    }

    public void updateFee() {
        fee = computeFee(hours, minutes);
    }

    public void outputBill() {
        System.out.println("Time worked: ");
        System.out.printf("%d hours and %d minutes\n", hours, minutes);
        System.out.printf("Rate: $%.2f per quarter hour.\n", RATE);
        System.out.printf("Amount due: $%.2f\n", fee);
    }
}
