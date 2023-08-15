package Lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        File file = new File("src" + separator + "Lesson36" + separator + "test");

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();

        String[] numbersString = line.split(" ");
        System.out.println(Arrays.toString(numbersString));

        int[] numbersInt = new int[numbersString.length];

        for (int i = 0; i < numbersString.length; i++) {
            numbersInt[i] = Integer.parseInt(numbersString[i]);
        }

        System.out.println(Arrays.toString(numbersInt));

        scanner.close();
    }
}
