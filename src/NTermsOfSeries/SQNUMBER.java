package NTermsOfSeries;
import java.util.Scanner;
public class SQNUMBER {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of terms: ");
            int n = sc.nextInt();

            System.out.print("The series is: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(i * i + " ");
            }
        }
    }


