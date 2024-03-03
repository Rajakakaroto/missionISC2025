package Loop;

import java.util.Scanner;
class PerfectNumber {
    public static void main(String args[]) {
        long n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextLong();
        int i = 1;

        // Execute until the condition becomes false
        while (i <= n / 2) {
            if (n % i == 0) {
                // Calculate the sum of factors
                sum += i;
            }
            // Increment the value of variable i by 1 after each iteration
            i++;
        }

        // Compare the sum with the number
        if (sum == n) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
    }
}
