import javax.management.Descriptor;

public class Lesson20 {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 40);
        Human h2 = new Human("Tom", 30);

        h1.printNumberOfPeople();
        h2.printNumberOfPeople();

        Human h3 = new Human("Rob", 50);
        h3.printNumberOfPeople();

        Human.description = "Nice";
        h1.getAllFields();
        h2.getAllFields();

        Human.description = "Bad";
        h1.getAllFields();
        h2.getAllFields();

    }
}

class Human {
    private String name;
    private int age;
    public static String description;
    public static int countPeople;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getAllFields() {
        System.out.println(name + ", " + age + ", " + description);
    }

    public static void printAllFields() {
        System.out.println();
    }

    public void printNumberOfPeople() {
        System.out.println("Number of people is " + countPeople);
    }
}

