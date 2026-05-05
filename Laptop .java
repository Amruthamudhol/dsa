class Laptop {
    void display() {
        System.out.println("Object created using new keyword");
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.display();
    }
}