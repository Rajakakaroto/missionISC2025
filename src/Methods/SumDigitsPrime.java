package Methods;

import java.util.Scanner;

public class SumDigitsPrime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        SumDigitsPrime obj=new SumDigitsPrime();
        boolean s=obj.checkprime(n);
        if(s==false)
            System.out.println("sum of digits is prime ");
        else
            System.out.println("sum of digits is not prime");
    }
    boolean checkprime(int n)
    {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        int c = 0;
        for (int i = 2; i < sum; i++) {
            if (sum % i != 0)
                continue;
            else {
                c = 1;
                break;
            }
        }
        if (c == 0)
            return false;
        return true;
    }
}
