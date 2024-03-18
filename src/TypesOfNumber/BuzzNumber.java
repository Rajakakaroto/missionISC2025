package TypesOfNumber;

//In simple words, a number is said to be Buzz if it ends with 7 or is divisible by 7.
import java.util.Scanner;

public class BuzzNumber {
    // Method to check if a number is a Buzz number
    public static boolean isBuzz(int number) {
        // A number is a Buzz number if it ends with 7 or is divisible by 7
        if (number % 10 == 7 || number % 7 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = scan.nextInt();

        if (isBuzz(number))
            System.out.println(number + " is a Buzz number.");
        else
            System.out.println(number + " is not a Buzz number.");
    }
}

