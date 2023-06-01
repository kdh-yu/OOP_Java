public class SelectionSortDemo {
    public static void main(String[] args) {
        double[] b = {7.7, 5.5, 11, 3, 16, 4.4, 20, 14, 13, 42};

        System.out.println("Array contents before sorting:");
        for (int i=0;mi<b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println();

        SelectionSort.sort(b, b.length);

        System.out.println("Sorted array values:");
        for (int i=0; i<b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println();
    }
}
