package Series;

    import java.util.Scanner;
public class Pg233v1c {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            int n = scan.nextInt();

            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if(i%2==0)
                    sum-=(i*i*i);
                else
                    sum+=(i*i*i);
            }

            System.out.println("The sum of the series 1 - 4 + 27 - 64 + ... + " + n + " is " + sum + ".");
        }

}
