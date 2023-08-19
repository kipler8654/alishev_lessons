package lesson46;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"),
                new Person(3, "Tom")};

        /*           1-ый способ
        try {
            FileOutputStream fos = new FileOutputStream("src/lesson46/people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(people.length);

            for(Person person : people){
                oos.writeObject(person);
            }

            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        //    2-ой способ
        try {
            FileOutputStream fos = new FileOutputStream("src/lesson46/people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(people);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
