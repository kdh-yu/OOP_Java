import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class MoreCatchBlocksDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("How many penciles do you have?");
            int pencils = in.nextInt();

            if (pencils < 0)
                throw new NegativeNumberException("pencils");
            
                System.out.println("How many erasers do you have?");
                int erasers = in.nextInt();
                double pencilsPerEraser;

                if (erasers < 0)
                    throw new NegativeNumberException("erasers");
                else if (erasers != 0)
                    pencilsPerEraser = pencils/(double)erasers;
                else
                    throw new DivisionByZeroException();
                
                System.out.println("Each eraser must last through " + pencilsPerEraser + " pencils.");
        }
        catch(NegativeNumberException e) {
            System.out.println("Cannot have a negative number of " + e.getMessage());
        }
        catch(DivisionByZeroException e) {
            System.out.println("Do not make any mistakes.");
        }
        System.out.println("End of program.");
    }
}
