public class PowerOfNumber {
    public static void main(String[] args) {

        int base = 2;
        int exponent = 5;
        int power = 1;

        for (int i = 1; i <= exponent; i++) {
            power = power * base;
        }

        System.out.println(base + "^" + exponent + " = " + power);
    }
}