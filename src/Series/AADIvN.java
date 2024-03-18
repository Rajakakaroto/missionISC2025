package Series;

import java.util.Scanner;

public class AADIvN
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        double sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=(a*a)/i;

        }
        System.out.println("Sum of the series is "+ sum);
    }
}
