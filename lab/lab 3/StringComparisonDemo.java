// Write a program StringComparisonDemo that prints the output on the next page.
// Create a String type variables
// s1 storing “Java isn't just for breakfast.”,
// s2 storing “JAVA isn't just for breakfast.”, and
// s3 storing “A cup of java is a joy forever.”.
// Compare s1 and s 2 by s1.equals(), s2.equals() , and s1.equalsIgnoreCase().
// Compare s3 and s 1 by s3.compareToIgnoreCase ()


public class StringComparisonDemo {
    public static void main(String[] args) {
        String s1 = "Java isn't just for breakfast.";
        String s2 = "JAVA isn't just for breakfast.";
        String s3 = "A cup of java is a joy forever.";

        if (s1.equals(s2)) System.out.println("The two lines are equal.");
        else System.out.println("Two lines are not equal.");

        if (s2.equals(s1)) System.out.println("The two lines are equal.");
        else System.out.println("Two lines are not equal.");

        if (s1.equalsIgnoreCase(s2)) System.out.println("But the lines are equal, ignoring case.");
        else System.out.println("Lines are not equal, even ignoring case.");

        System.out.println("\"" + s3 + "\" \nprecedes");
        System.out.println("\"" + s1 + "\"\nin alphabetic ordering.");
        
    }
}
