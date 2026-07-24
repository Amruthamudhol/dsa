public class DiamondPattern {
    public static void main(String[] args) {

        int rows = 5;

        // Upper half
        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = rows - 1; i >= 1; i--) {

            // Print spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}