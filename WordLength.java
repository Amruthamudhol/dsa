class WordLength {
    public static void main(String[] args) {

        String[] words = {"Java", "Programming", "Code", "Developer", "AI", "Laptop"};

        System.out.println("Length of each word:");
        for (String word : words) {
            System.out.println(word + " -> " + word.length());
        }

        System.out.println(" Words with length greater than 4:");
        for (String word : words) {
            if (word.length() > 4) {
                System.out.println(word);
            }
        }
    }
}

