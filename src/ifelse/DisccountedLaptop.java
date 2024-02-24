package ifelse;

import java.util.Scanner;

/*An electronics shop has announced the following seasonal discounts on the
        purchase of certain items.
        Purchase Amount ` Discount on Laptop Discount on desktop PC
        0–25000 0.0% 5.0%
        25001 – 57000 5.0% 7.5%
        57001 – 100000 7.5% 10.0%
        More than 100000 10.0% 15.0%
        Write a program based on the above criteria, to input name, address, amount
        of purchase and the type of purchase (L for Laptop and D for Desktop) by
        a customer. Compute and print the net amount to be paid by a customer
        along with his name and address.
        (Hint: discount = (discount rate/100)* amount of purchase
        Net amount = amount of purchase – discount)*/
public class DisccountedLaptop
{
    public static void main(String[] args)
    {
        double disc = 0,netamt;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NAME");
        String name=sc.nextLine();
        System.out.println("enter address");
        String add=sc.nextLine();
        System.out.println("ENTER AMOUNT OF PURCHASE");
        int pur=sc.nextInt();
        System.out.println("ENTER L FOR LAPTOP OR D FOR DEKSTOP");
        char typ=sc.next().charAt(0);

        if (typ=='l') {
            if (pur >= 100000)
                disc = (15.0 / 100) * pur;
            else if (pur < 100000 && pur >= 57001)
                disc =  ((7.5 / 100) * pur);
            else if (pur < 57001 && pur >= 25001)
                disc = (5.0 / 100) * pur;
            else
                disc = (0/100)*pur;
        }
            else if (typ=='d'){
                if (pur >= 100000)
                    disc = (15d / 100) * pur;
                else if (pur < 100000 && pur >= 57001)
                    disc = (10.0 / 100) * pur;
                else if (pur < 57001 && pur >= 25001)
                    disc =  ((7.5 / 100) * pur);
                else
                    disc = (5.0/100)*pur;
            } 
            netamt=pur-disc;
        System.out.println("name :"+name);
        System.out.println("address "+add);
        System.out.println("AMOUNT TO BE PAID ON DISCOUNTED ITEM :"+netamt);
    }
}
