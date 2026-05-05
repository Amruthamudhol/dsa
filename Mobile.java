class Mobile {
    void display() {
        System.out.println("Object created using newInstance()");
    }

    public static void main(String[] args) throws Exception {
        Mobile m1 = Mobile.class.newInstance();
        m1.display();
    }
}