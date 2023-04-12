import java.lang.Character;
import java.util.Scanner;

public class StringProcessor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence;
        System.out.println("Enter a one line sentence:");
        sentence = in.nextLine();
        System.out.println("The revised sentence is:");
        sentence = sentence.toLowerCase();
        char first = sentence.charAt(0);
        sentence = Character.toUpperCase(first) + sentence.substring(1);
        System.out.println(sentence);
        in.close();
    }
}
