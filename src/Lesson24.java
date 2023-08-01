import org.w3c.dom.ls.LSOutput;

public class Lesson24 {
    public static void main(String[] args) {
        HumanToString h1 = new HumanToString("Bob", 40);
        System.out.println(h1);
    }
}

class HumanToString {
    private String name;
    private int age;

    public HumanToString(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ", " + age;
    }
}