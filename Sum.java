class Sum {
    public static void main(String[] args) {

        int n = 10;   
        int i = 1;
        int sum = 0;

        while(i <= n) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum of first " + n + " numbers is: " + sum);
    }
}