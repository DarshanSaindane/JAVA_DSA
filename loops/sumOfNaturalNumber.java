package loops;
import java.util.Scanner;

public class sumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate GCD
        int gcd = findGCD(num1, num2);

        // Output the result
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close();
    }

    // Method to calculate GCD using Euclidean algorithm
    public static int findGCD(int a, int b) {
        // Ensure a is greater than or equal to b
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
