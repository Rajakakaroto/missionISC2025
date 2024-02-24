package ifelse;

import java.util.Scanner;

/*Given below is a hypothetical table showing rates of Income Tax for male
        citizens below the age of 65 years:
        Taxable Income (TI) in Income Tax in
        Does not exceed 1,60,000 Nil
        Is greater than 1,60,000 and less than or equal to 5,00,000 (TI – 1,60,000) * 10%
        Is greater than 5,00,000 and less than or equal to 8,00,000 [(TI – 5,00,000) * 20%] + 34,000
        Is greater than 8,00,000 [(TI – 8,00,000) * 30%] + 94,000
        Write a program to input the age, gender (male or female) and Taxable
        Income of a person. If the age is more than 65 years or the gender is
        female, display “wrong category*.
        If the age is less than or equal to 65 years and the gender is male, compute
        and display the Income Tax payable as per the table given above*/
public class TaxOfMale
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int age= sc.nextInt();
        System.out.println("enter m for male" +
                "Enter f for female");
        char mf= sc.next().charAt(0);
        if (mf=='m' && age<=65)
        {
            System.out.println("enter your income");
            int ti= sc.nextInt();
            if(ti<=160000)
                System.out.println("no tax");
            else if(ti>160000 && ti<500000)
                System.out.println("tax to be paid "+(ti-160000)*(10/100));
            else if (ti>500000 && ti<800000 )
                System.out.println("tax to be paid "+(ti-500000)*(20/100)+34000);
                else
                System.out.println("tax to be paid "+(ti-800000)*(30/100)+9400);
        }
        else
            System.out.println("no tax for female");
    }
}
