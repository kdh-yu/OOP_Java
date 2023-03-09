// Lab 2-1
// Write a program PrintfDemo that prints the output in the next page.
// Create variables: 
// String aString whose value is “abc”,
// char oneCharacter whose value is “Z”,
// and double d whose value is 12345.123456789.
// You should use Formatting.

public class PrintfDemo {
    public static void main(String[] args){
        String aString = "abc";
        char oneCharacter = 'Z';
        double d = 12345.123456789;

        System.out.println("String output:");
        System.out.println("START1234567890");
        System.out.printf("START%4sEND\n", aString);
        System.out.printf("START%2sEND\n", aString);

        System.out.println();
        System.out.println("Character output:");
        System.out.println("START1234567890");
        System.out.printf("START%cEND\n", oneCharacter);
        System.out.printf("START%4cEND\n", oneCharacter);    

        System.out.println();
        System.out.println("Floating-point output:");
        System.out.println("START1234567890");
        System.out.printf("START%.6fEND\n", d);
        System.out.printf("START%.4fEND\n", d);
        System.out.printf("START%.2fEND\n", d);
        System.out.printf("START%12.4fEND\n", d);
        System.out.printf("START%eEND\n", d);
        System.out.printf("START%12.5eEND\n", d);
    }    
}
