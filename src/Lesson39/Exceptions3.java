package Lesson39;

import java.io.File;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {
        //Checked Exception(Compile time exception) = исключительные случаи в работе программы
        //Unchecked Exception(Runtime exception) = ошибка в работе программы

        int a = 1 / 0;   //Unchecked Exception

        String name = null;   //Unchecked Exception
        name.length();

        int[] arr = new int[2];   //Unchecked Exception
        System.out.println(arr[2]);
    }
}
