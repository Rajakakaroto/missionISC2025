package TypesOfNumber;

import java.util.Scanner;

public class BouncyNumber {
    // Function to check if the number is increasing
    static boolean isIncreasing(int num) {
        String str = String.valueOf(num);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) < str.charAt(i - 1))
                return false;
        }
        return true;
    }

    // Function to check if the number is decreasing
    static boolean isDecreasing(int num) {
        String str = String.valueOf(num);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > str.charAt(i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number you want to check: ");
        int inputNumber = scan.nextInt();

        if (isIncreasing(inputNumber) || isDecreasing(inputNumber) || inputNumber < 101)
            System.out.println(inputNumber + " is not a Bouncy number.");
        else
            System.out.println(inputNumber + " is a Bouncy number.");
    }
}
