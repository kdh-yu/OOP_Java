public class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }    
    public NegativeNumberException() {
        super("Negative Number Exception!");
    }
}
