class EvenOddSum {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] % 2 == 0) {
                evenSum = evenSum + arr[i];
            } else {
                oddSum = oddSum + arr[i];
            }
        }

        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Sum of Odd Numbers: " + oddSum);
    }
}