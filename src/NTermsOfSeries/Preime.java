package NTermsOfSeries;

import java.util.Scanner;

public class Preime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.print("The series is: ");
        int term = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(term + " ");
            term += 2; // Increment by 2 to get the next odd number
        }
    }
}
