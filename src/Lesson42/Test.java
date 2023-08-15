package Lesson42;

public class Test {
    public static void main(String[] args) {
        //разница == и .equals
        //  animal1   ->    {1}
        //  animal2   ->    {1}

        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);

        System.out.println(animal1.equals(animal2));


        //        string pool

        String string1 = "Hello";               // string1          ->          {"Hello"}
        String string2 = "Hello123";           // string2

        System.out.println(string1 == string2);


        String a = "hello";
        String b = "hello123".substring(0, 5);
        System.out.println(b);
        System.out.println(a == b);//несмотря на то что они a и b равны вывод будет false
        // поэтому лучше всегда использовать .equals
    }
}
