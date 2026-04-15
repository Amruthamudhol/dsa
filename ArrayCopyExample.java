public class ArrayCopyExample {
    public static void main(String[] args) {

        // Original array
        String[] names = {"Amruta", "Rahul", "Sneha", "Kiran"};

        // Create another array with same size
        String[] selectedNames = new String[names.length];

        // Copy elements from names to selectedNames
        System.arraycopy(names, 0, selectedNames, 0, names.length);

        // Print copied array
        System.out.println("Copied Names:");
        for (String name : selectedNames) {
            System.out.println(name);
        }
    }
}