// Lab 1-2
// Write a program StringProcessDemo that prints the output below.
// You should use methods indexOf(), substring(), and length().

public class StringProcessDemo {
    public static void main(String[] args){
        String sentence = "I hate text processing!";
        String remove_word = "hate";
        String sub_word = "adore";
        int pos = sentence.indexOf(remove_word);

        System.out.println("01234567890123456789012");
        System.out.println(sentence);
        System.out.println("The word \"" + remove_word + "\" starts at index " + pos);
        System.out.println("The changed string is:");
        System.out.println(sentence.substring(0, pos) + sub_word + sentence.substring(pos+remove_word.length()));
    }
}
