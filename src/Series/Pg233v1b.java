package Series;

    import java.util.Scanner;
public class Pg233v1b
{
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            int n = scan.nextInt();
            scan.close();

            int sum = 0;
            for (int i = 1; i <= n / 2; i++) {
                sum += (i * 2) * (int) Math.pow(-1, i);
            }

            System.out.println("The sum of the series 2-4+6-8+...+/-" + n + " is " + sum + ".");
        }


}
