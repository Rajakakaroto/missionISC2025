package Patteren.Numeric;

public class IncreasingColumn {

    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
