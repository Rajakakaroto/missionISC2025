

import java.util.*;

    public class BirthDateSeTodaysday_NoofYears {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("todays year");
            int tyear = scanner.nextInt();
            //System.out.println("todays month");
            // int tmonth = scanner.nextInt();
            System.out.println("enter your birth YEAR");
            int byear= scanner.nextInt();
            //System.out.println("enter your birth month");
            //int bmonth= scanner.nextInt();

            int year=tyear-byear;
            System.out.println("no of years = "+year);
        }
    }