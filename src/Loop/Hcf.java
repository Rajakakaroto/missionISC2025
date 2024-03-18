package Loop;

import java.util.Scanner;
class Hcf
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int max;
        max=Math.max(a,b);
        for (int i =max ; i >=1 ; i--) {
            if (a%i==0 && b%i==0)
            {
                System.out.println("HCF : "+i);
                break;
            }

        }
    }
}
