public class MoveZeros {
    public static void main(String[] args) {

        int[] arr = {1, 0, 5, 0, 3, 0, 8, 2};

        System.out.println("Array before moving zeros:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        int index = 0;

      
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        System.out.println("\nArray after moving zeros:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}