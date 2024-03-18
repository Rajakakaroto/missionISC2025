package TypesOfNumber;
//Zero can be present at any of the positions except the beginning of the number.
import java.util.Scanner;

public class Duck {
    // Method to check if a number is a Duck number
    public static boolean checkNumber(int number) {
        while (number != 0) {
            if (number % 10 == 0)
                return true; // Return true if the number is a Duck number
            number = number / 10; // Remove the last digit
        }
        return false; // Return false if the number is not a Duck number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter another integer number: ");
        int n2 = sc.nextInt();

        if (checkNumber(n1))
            System.out.println(n1 + " is a Duck number.");
        else
            System.out.println(n1 + " is not a Duck number.");

        if (checkNumber(n2))
            System.out.println(n2 + " is a Duck number.");
        else
            System.out.println(n2 + " is not a Duck number.");
    }
}

