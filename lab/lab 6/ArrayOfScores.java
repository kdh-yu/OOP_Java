import java.util.Scanner;

public class ArrayOfScores {
    public static void main(String[] args) {
        double[] score = new double[5];
        int index;
        double max;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter " + score.length + " scores:");
        for (index=0; index<score.length; index++)
            score[index] = in.nextDouble();
        
        max = score[0];
        // Linear Search
        for (index=0; index<score.length; index++) {
            if (max < score[index])
                max = score[index];
        }
        
        System.out.println("The highest score is " + max);
        System.out.println("The scores are:");
        for (index=0; index<score.length; index++)
            System.out.println(score[index] + " differs from max by " + (max-score[index]));
        
        in.close();
    }
    
}
