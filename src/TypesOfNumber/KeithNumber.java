package TypesOfNumber;
//numbers sum of digits till the number comes

import java.util.Scanner;
public class KeithNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Keith number: ");
        int number = sc.nextInt();

        if (isKeithNumber(number)) {
            System.out.println(number + " is a Keith number.");
        } else {
            System.out.println(number + " is not a Keith number.");
        }
    }

    static boolean isKeithNumber(int num) {
        String numStr = String.valueOf(num);
        int length = numStr.length();
        int[] terms = new int[length];
        int sum = num;

        // Initialize the terms array with the digits of the number
        for (int i = 0; i < length; i++) {
            terms[i] = numStr.charAt(i) - '0';
        }

        while (sum < num) {
            sum = 0;
            for (int i = 0; i < length; i++) {
                sum += terms[i];
                if (i > 0) {
                    terms[i - 1] = terms[i];
                }
            }
            terms[length - 1] = sum;
            if (sum == num) {
                return true;
            }
        }
        return false;
    }
}
