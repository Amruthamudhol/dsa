public class ArrayMinMax {
    public static void main(String[] args)
	{

        int[] arr = {25, 10, 78, 5, 99, 32, 18};

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) 
		{

            if (arr[i] > largest) 
			{
                largest = arr[i];
            }

            if (arr[i] < smallest)
				{
                smallest = arr[i];
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}