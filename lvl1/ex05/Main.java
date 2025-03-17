package lvl1.ex05;

import java.io.IOException;

public class Main {

    public static void main(String[] argv) {
        try {
            Serializer serializer = new Serializer();
            Person person = new Person("Pepe", 45, "pepito");
            serializer.serializeObject(person);
            Person pepe = (Person) serializer.deserializeObject("object.ser");
            System.out.println(
                pepe.getName() + " " + pepe.getLastName() + " " + pepe.getAge()
            );
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
