import java.util.Scanner;

public class DanceLesson {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of male dancers: ");
        int men = in.nextInt();

        System.out.println("Enter number of female dancers: ");
        int women = in.nextInt();

        if (men == 0 && women == 0) {
            System.out.println("Lesson is canceled. No students.");
            System.exit(0);
        }
        else if (men == 0) {
            System.out.println("Lesson is canceld. No men.");
            System.exit(0);
        }
        else if (women == 0) {
            System.out.println("Lesson is canceld. No women.");
            System.exit(0);
        }
        if (women >= men)
            System.out.println("Each man must dance with " + women/(double)men + " women.");
        else
            System.out.println("Each woman must dance with " + men/(double)women + " men.");
        
            System.out.println("Begin the lesson.");
    }
}
