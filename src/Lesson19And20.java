public class Lesson19And20 {
    public static void main(String[] args) {
        Human human = new Human("Tom", 18);
        human.setAge(21);
        human.setName("John");
        human.getInfo();
        Human human1 = new Human();
        human1.getInfo();
    }
}

class Human {
    String name;
    int age;

    public Human() {
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public Human(String name) {
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }

    public Human(String name, int age) {
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}