package Lesson29;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(cat);
        test(dog);
        test(animal);

        System.out.println("----------");
        Animal animal1 = new Dog();
        animal1.eat();
    }

    public static void test(Animal animal){
        animal.eat();
    }

}
