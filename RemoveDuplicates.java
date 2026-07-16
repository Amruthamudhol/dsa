 public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 10, 50};

        int[] result = new int[arr.length];
        int size = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < size; j++) {
                if (arr[i] == result[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result[size] = arr[i];
                size++;
            }
        }

        System.out.print("Array After Removing Duplicates: ");

        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }
    }
}