public class Book implements Cloneable {
    int id = 201;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void display() {
        System.out.println("Object created using clone()");
        System.out.println("Id: " + id);
    }

    public static void main(String[] args) throws Exception {
        Book b1 = new Book();
        Book b2 = (Book) b1.clone();

        b2.display();
    }
}