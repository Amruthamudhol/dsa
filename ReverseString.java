class ReverseString {
    public static void main(String[] args) {
        String str = "idli";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println("Reversed String: " + sb);
    }
}
