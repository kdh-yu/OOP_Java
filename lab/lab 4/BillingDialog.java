public class BillingDialog {
    public static void main(String[] args) {
        Bill bill = new Bill();

        System.out.println("Welcome to the law aoffices of");
        System.out.println("Dewey, Cheatham, and Howe.");
        bill.inputTimeWorked();
        bill.updateFee();
        bill.outputBill();

        System.out.println("We have placed a lien on your house.");
        System.out.println("It has been our pleasure to serve you.");
    }
}
