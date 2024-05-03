/*
ex 13:-2*3*5*7*11*13;

 */


import java.util.Scanner;

public class Primorial
{
    int prime(int n)
    {
        int count=0;
        for (int i = 2; i <=n/2 ; i++)
        {
         if (n%i==0)
             count++;
         else continue;
        }
        if(count==0)
            return n;
        else return 1;
    }
    public static void main(String[] args)
    {
    int pro=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER LIMIT");
        int num= sc.nextInt();
        for (int i = 2; i <=num ; i++)
        {
            Primorial obj=new Primorial();
            int k=obj.prime(i);
            if(k!=1)

            pro*=k;
        }
        System.out.println("primorial :-> "+pro);
    }
}
