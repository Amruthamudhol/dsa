import java.io.*;

public class Employee implements Serializable {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) throws Exception {

        Employee e1 = new Employee(301, "Amruta");

        // Serialization
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.txt"));
        out.writeObject(e1);
        out.close();

        // Deserialization
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.txt"));
        Employee e2 = (Employee) in.readObject();
        in.close();

        System.out.println("Object created using deserialization");
        e2.display();
    }
}