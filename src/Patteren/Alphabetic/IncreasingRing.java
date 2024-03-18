package Patteren.Alphabetic;
public class IncreasingRing
{
    public static void main(String[] args)
    {
        int c=65;
        for (int i = 1; i <=5 ; i++)
        {
            for (int j = 1; j <=5-i ; j++)
            {
                System.out.printf(" ");
            }
            for (int j = 1; j <=i ; j++)
            {
                System.out.printf((char)c++ +" ");
            }
            System.out.println();
        }
        for (int i = 1; i <5 ; i++)
        {
            for (int j = 1; j <=i ; j++)
            {
                System.out.printf(" ");
            }
            for (int j = 1; j <=5-i ; j++)
            {
                System.out.printf((char)c++ +" ");
            }
            System.out.println();
        }
    }
}
