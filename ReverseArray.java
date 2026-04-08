public class ReverseArrayExample {
    public static void main(String[] args) {

        int[] arr = {100, 67, 70, 40, 78};

        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++)
		{
            System.out.print(arr[i] + " ");
        }

        int start = 0;
        int end = arr.length - 1;

        while (start < end)
		{
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }


        System.out.println("\n  Reverse  Array:");
        for (int i = 0; i < arr.length; i++)
		{
            System.out.print(arr[i] + " ");
        }
    }
}