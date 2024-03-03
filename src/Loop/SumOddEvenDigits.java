package Loop;
import java.util.*;
public class SumOddEvenDigits
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int num=sc.nextInt();
        int evens=0,odds=0;
        while (num>0)
        {
            int rem=num%10;
            if (rem%2==0)
                evens+=rem;
            else
                odds+=rem;
            num/=10;
        }
        System.out.println("sum of even digits: "+evens);
        System.out.println("sum of odd digits: "+odds);

    }
}
