// Lab 2-2
// Write a program ScannerDemo that prints the output in the next page.
// Create two variables numberOfPods and peasPerPod to store input values,
// and a variable totalNumberOfPeas to store the value calculated by the following equation. 
// totalNumberOfPeas = numberOfPods * peasPerPod;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        
        System.out.println("Enter the number of pods followed by");
        System.out.println("the number of peas in a pod: ");

        Scanner in = new Scanner(System.in);
        int numberOfPods = in.nextInt();
        int peasPerPod = in.nextInt();
        int totalNumberOfPeas = numberOfPods * peasPerPod;
        
        System.out.printf("%d pods and %d peas per pod.\n", numberOfPods, peasPerPod);
        System.out.printf("The total number of peas = %d\n", totalNumberOfPeas);

        in.close();
    }
    
}
