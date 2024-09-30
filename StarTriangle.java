import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        // Create a Scanner object to get input from user
        Scanner input = new Scanner(System.in);

        // Ask the user to input the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        int n = input.nextInt();

        // Loop to generate the triangle
        for (int i = 1; i <= n; i++) {
            // For each row, print (2*i - 1) stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner
        input.close();
    }
}
