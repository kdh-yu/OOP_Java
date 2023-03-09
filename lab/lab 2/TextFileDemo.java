// Lab 2-6
// Make a file player.txt and write a program TextFileDemo
// that prints the output below. Create variables highscore and name to store values from the file.
// You should use try/catch block and methods hasNextLine() and close().

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileDemo {
    public static void main(String[] args) {
        Scanner fileIn = null;

        try {
            fileIn = new Scanner(new FileInputStream("player.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not Found.");
            System.exit(0);
        }

        int highscore;
        String name;
        System.out.println("Text left to read? : " + fileIn.hasNextLine());
        while(fileIn.hasNextLine()) {
            highscore = fileIn.nextInt();
            fileIn.nextLine();
            name = fileIn.nextLine();
            System.out.println("Name : " + name);
            System.out.println("High Score : " + highscore);
            System.out.println("\nText left to read? : " + fileIn.hasNextLine());
        }
    }
}
