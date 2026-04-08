public class SecondLargestExample {
    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23, 67};

        for (int i = 0; i < arr.length; i++)
		{
            for (int j = i + 1; j < arr.length; j++) 
			{

                if (arr[i] > arr[j]) 
				{
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int secondLargest = arr[arr.length - 2];

        System.out.println("Second Largest Number: " + secondLargest);
    }
}