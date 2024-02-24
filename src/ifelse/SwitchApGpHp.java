package ifelse;

import java.util.*;

public class SwitchApGpHp
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to be calculated");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter 1 for arithmetic mean" +
                "enter 2 for geometric mean" +
                "enter 3 for harmonic mean");
        int n=sc.nextInt();
        switch (n)
        {
            case 1:
                System.out.println("arithmetic mean "+(a+b)/2);
                break;
            case 2:
                System.out.println("geometric mean "+Math.sqrt(a*b));
                break;
            case 3:
                System.out.println("harmonic mean "+2*a*b/(a+b));
                break;
            default:
                System.out.println("wrong number entered");

        }
    }
}
