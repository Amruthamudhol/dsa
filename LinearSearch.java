 public class LinearSearch {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int search = 30;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                System.out.println("Found at index " + i);
                return;
            }
        }

        System.out.println("Not Found");
    }
}