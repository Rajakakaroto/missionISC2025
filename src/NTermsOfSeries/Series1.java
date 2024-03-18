package NTermsOfSeries;

import java.util.Scanner;

class Series1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.print("The series is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(1 + ((i * (i + 1)) / 2) + " ");
        }
    }
}

