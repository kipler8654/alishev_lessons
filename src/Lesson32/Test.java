package Lesson32;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();

        //Upcasting - Восходящее преобразование
        Animal animal = dog;

        //Downcasting - Нисходящее преобразование
        Dog dog2 = (Dog) animal;
        dog2.bark();

        //Пример ошибки Downcasting
        Animal a = new Animal();
        Dog dog3 = (Dog) a;
        dog3.bark();
    }
}
