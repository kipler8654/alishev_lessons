public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Роман");
        person1.setAge(50);
        System.out.println("Имя person1 - " + person1.getName());
        person1.speak();

        System.out.println();

        Person person2 = new Person();
        person2.setName("Вова");
        person2.setAge(-1);
        System.out.println("Имя person2 - " + person2.getName());

        System.out.println();

        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии: " + year1);
        System.out.println("Второму человеку до пенсии: " + year2);
    }
}

class Person {
    /*
    У класса могут быть:
    1. Данные (поля)
    2. Действия, которые он может совершать (методы)
    */
    private String name;
    private int age;

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Ты ввел пустое имя");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Ты ввел неверный возраст");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }

    void sayHello() {
        System.out.println("Привет");
    }
}