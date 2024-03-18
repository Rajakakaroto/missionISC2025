package Patteren.Numeric;
/*
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
 */
public class SameColumnDecreasingRow
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number of rows: ");

        int rows = 5;
        for (int i =5; i >= 1; i--)
        {
            for (int j = 5; j >= i; j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }

    }
}
