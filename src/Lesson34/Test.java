package Lesson34;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimal);
        test(listOfDogs);
    }

    private static void test(List<? extends Animal> list) { //вместо extends можно написать super.
        for (Animal animal : list) {// Super - все что выше по иерархии наследования чем animal, то есть Object
            animal.eat();
        }
    }
}
