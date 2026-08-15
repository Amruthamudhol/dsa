import java.util.Arrays;

public class SmallestThreeNumbers {

    public static void main(String[] args) {
        int[] arr = {9, 3, 7, 1, 5, 2, 8, 4};

        int[] smallestThree = findSmallestThree(arr);

        System.out.println("The 3 smallest numbers are: " +
            smallestThree[0] + ", " + smallestThree[1] + ", " + smallestThree[2]);
    }

    // Method to find the 3 smallest numbers without full sorting
    public static int[] findSmallestThree(int[] arr) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < first) {
                third = second;
                second = first;
                first = num;
            } else if (num < second) {
                third = second;
                second = num;
            } else if (num < third) {
                third = num;
            }
        }

        return new int[] { first, second, third };
    }
}