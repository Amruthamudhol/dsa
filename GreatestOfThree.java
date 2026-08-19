 class GreatestOfThree {

    public static void main(String[] args) {

        int a = 10;
        int b = 25;
        int c = 15;

        if (a >= b && a >= c) {
            System.out.println(a + " is the greatest number");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the greatest number");
        } else {
            System.out.println(c + " is the greatest number");
        }
    }
}