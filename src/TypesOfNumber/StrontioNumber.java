package TypesOfNumber;

import java.util.Scanner;

public class StrontioNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a four-digit number: ");
        int num = sc.nextInt();
        int originalNum = num;

        // Multiply the number by 2, find the remainder after dividing by 1000,
        // and then divide by 10 to get a two-digit number
        num = (num * 2 % 1000) / 10;

        // Compare the remainder and quotient
        if (num % 10 == num / 10)
            System.out.println(originalNum + " is a Strontio number.");
        else
            System.out.println(originalNum + " is not a Strontio number.");
    }
}
