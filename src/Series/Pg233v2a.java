package Series;
import java.util.Scanner;
public class Pg233v2a {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scan.nextInt();

        float sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i%2==0)
                sum-=(float) 1/i*2;
            else
                sum+=(float) 1/i*2;
        }

        System.out.println("The sum of the series  " + sum );
    }

}
