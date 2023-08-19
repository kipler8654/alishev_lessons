package lesson48;

public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        Animal animal1 = Animal.DOG;
        System.out.println(animal);
        System.out.println(animal1);

        switch (animal) {
            case CAT:
                System.out.println("It's a cat");
                break;
            case DOG:
                System.out.println("It's a dog");
                break;
            case FROG:
                System.out.println("It's a frog");
                break;
        }

        Season season = Season.WINTER;
        System.out.println(season.getTemperature());

        //Object -> Enum -> Season

        System.out.println(season instanceof Enum);

        System.out.println(season);

        switch (season) {
            case SUMMER:
                System.out.println("It's warm outside");
                break;
            case WINTER:
                System.out.println("It's cold outside");
                break;
        }

        Season season1 = Season.AUTUMN;
        Animal animal2 = Animal.CAT;
        System.out.println(season1.name());
        System.out.println(animal2.name());

        Animal cat = Animal.valueOf("CAT");
        System.out.println(cat);

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());
    }
}
