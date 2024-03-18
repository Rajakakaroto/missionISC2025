package TypesOfNumber;

import java.util.Scanner;

public class KrishnamurthyNumber {
    // Method to calculate the factorial of a number
    static int factorial(int num) {
        int fact = 1;
        while (num != 0) {
            fact *= num;
            num--;
        }
        return fact;
    }

    // Method to check if a number is Krishnamurthy
    static boolean isKrishnamurthy(int num) {
        int sum = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (isKrishnamurthy(number))
            System.out.println(number + " is a Krishnamurthy number.");
        else
            System.out.println(number + " is not a Krishnamurthy number.");
    }
}
