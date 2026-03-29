class BitShift {

    public static void main(String[] args) 
	{

        int num = 11;

        System.out.println("number: " + num);

        int leftShift = num << 2;
        System.out.println("After left shift (num << 2): " + leftShift);

        int rightShift = num >> 2;
        System.out.println("After right shift (num >> 2): " + rightShift);
    }
}