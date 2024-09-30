import java.util.Arrays;
import java.util.Scanner;
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Ask user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();
        // Declare an array of the given size
        double[] numbers = new double[size];
        // Input elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = input.nextDouble();
        }
        // Calculate sum and average
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / size;
        // Sort the array
        Arrays.sort(numbers);
        // Display results
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average value of array elements: " + average);
        input.close();
    }
}
