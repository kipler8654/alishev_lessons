package Lesson28;

import Lesson28.Packet1.Person;

class Test extends Person {
    public int id;

    public static void main(String[] args) {
        //public, private, default(все что default доступно в пределах этого пакета), protected(доступны в пределах одного пакета,
        //доступны всем подклассам даже если эти подклассы вне пакета).
        System.out.println(Person.CONSTANT);
    }
    public Test(){
        name = "Tom";
    }
}
