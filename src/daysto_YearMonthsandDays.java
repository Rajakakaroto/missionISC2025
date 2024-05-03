import java.util.Scanner;
class daysto_YearMonthsandDays
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of days: ");
            int days = scanner.nextInt();

            int years = days / 365;
            int remainingDays = days % 365;
            int months = remainingDays / 30;
            int remainingDays2 = remainingDays % 30;

            System.out.println("The equivalent number of years, months, and days is: ");
            System.out.println(years + " years, " + months + " months, and " + remainingDays2 + " days.");
        }
    }

