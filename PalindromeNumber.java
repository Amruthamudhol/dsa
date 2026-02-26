class PalindromeNumber {
    public static void main(String[] args) {

        int num = 121;   
        int original = num;
        int reverse = 0;

        for( ; num > 0; num = num / 10) {

            int digit = num % 10;         
            reverse = reverse * 10 + digit; 
        }

        if(original == reverse) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is Not Palindrome");
        }
    }
}