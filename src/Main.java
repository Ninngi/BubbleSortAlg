import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> integerList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers (press enter after each integer, and enter any NON-Integer to stop):");
        while (scanner.hasNextInt()) {
            int integer = scanner.nextInt();
            integerList.add(integer);
        }

        scanner.close();

        int[] numbers = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            numbers[i] = integerList.get(i);
        }

        System.out.println("before sorting: " + Arrays.toString(numbers));
        var sorter = new BubbleSortAlg();
        sorter.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));
    }
}