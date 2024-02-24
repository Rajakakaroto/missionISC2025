package ifelse;

import java.util.Scanner;

/*wap to analyse pepole of certain age group who are elegible to get suitable job if
age>=18  && 12 pass
 */
public class AgeSuitableJob
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age ");
        int age= sc.nextInt();
        System.out.println("enter your class completed");
        int cls= sc.nextInt();
        if (age>=18 && cls>=12)
            System.out.println("eligible for particular job");
        else
            System.out.println("not eligible for this job");
    }
}
