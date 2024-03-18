package Series;

import java.util.Scanner;
public class Pg233v1e{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scan.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
           sum+=(i*(i+1));
        }

        System.out.println("The sum of the series : " + sum + ".");
    }

}

