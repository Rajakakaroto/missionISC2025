package TypesOfNumber;

import java.util.Scanner;

public class SmithNumber{
    // Function to find the sum of digits of its prime factors
    static int findSumPrimeFactors(int n) {
        int i = 2, sum = 0;
        while (n > 1) {
            if (n % i == 0) {
                sum += findSumOfDigit(i);
                n = n / i;
            } else {
                do {
                    i++;
                } while (!isPrime(i));
            }
        }
        return sum;
    }

    // Function to find the sum of digits of the given number
    static int findSumOfDigit(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n = n / 10;
        }
        return s;
    }

    // Function to check if a factor is prime or not
    static boolean isPrime(int k) {
        boolean b = true;
        int d = 2;
        while (d < Math.sqrt(k)) {
            if (k % d == 0) {
                b = false;
            }
            d++;
        }
        return b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sumOfDigits = findSumOfDigit(n);
        int sumOfPrimeFactors = findSumPrimeFactors(n);

        if (sumOfDigits == sumOfPrimeFactors)
            System.out.println("The given number is a Smith number.");
        else
            System.out.println("The given number is not a Smith number.");
    }
}
