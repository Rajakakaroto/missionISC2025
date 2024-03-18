package Patteren;
   /*        *
           * * *
         * * * * *
       * * * * * * *   */

public class TrianglePattern1
{
    public static void main(String[] args)
    {
        int c=1;
        for (int i = 1; i <=5 ; i++)
        {
            for (int j = 1; j <=5-i ; j++)
            {
                System.out.printf("  ");
            }
            for (int j = 1; j <=c ; j++)
            {
                System.out.printf("* ");
            }
            c+=2;
            System.out.println();
        }
    }
}
