package Series;

public class Pg233v1a {

        public static void main(String[] args) {
            int n = 10; // Change n to the desired value

            // Initialize the sum
            int totalSum = 0;

            // Iterate from 1 to n
            for (int i = 1; i <= n; i++) {
                // Calculate the term in the series
                int term = (int) Math.pow(-1, i + 1) * (i - 1);
                // Add the term to the total sum
                totalSum += term;
            }

            System.out.println("The sum of the series -1 + 0 + 3 + ... + " + n + " is " + totalSum + ".");
        }


}
