package lesson47;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person = new Person(1, "Mike");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/lesson47/people.bin"))) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
