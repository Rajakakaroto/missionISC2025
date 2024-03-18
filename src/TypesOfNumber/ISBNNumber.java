package TypesOfNumber;

import java.util.Scanner;

public class ISBNNumber {
    // Method to check if a number is a valid ISBN
    static boolean checkISBNNumber(long number) {
        int sum = 0;
        String strNumber = String.valueOf(number);

        if (strNumber.length() != 10) {
            return false; // Not a valid ISBN if not 10 digits
        }

        for (int i = 0; i < strNumber.length(); i++) {
            int intNumber = Integer.parseInt(strNumber.substring(i, i + 1));
            int dNumber = i + 1;
            int t = dNumber * intNumber;
            sum += t;
        }

        // Check whether the sum is divisible by 11
        return (sum % 11) == 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a 10-digit ISBN number: ");
        long isbnNumber = scan.nextLong();

        if (checkISBNNumber(isbnNumber))
            System.out.println("Valid ISBN.");
        else
            System.out.println("Not a valid ISBN.");
    }
}

