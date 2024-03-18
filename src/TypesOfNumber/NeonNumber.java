package TypesOfNumber;
//sum of digits of square of num gives number


import java.util.Scanner;
public class NeonNumber{
    public static void main(String[] args) {
        int sum = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        n = sc.nextInt();
        int square = n * n;

        while (square != 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }
        if (n == sum)
            System.out.println(n + " is a Neon Number.");
        else
            System.out.println(n + " is not a Neon Number.");
    }
}
