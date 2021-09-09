package Lesson4;
import java.io.IOException;
import java.util.*;

public class MyHomework3 {
    static final String FILE_NAME1 = "C://JAVA/Java2Lesson3Homework3.txt";
    static final String FILE_NAME2 = "Java2Lesson3Homework3.txt";

    public static void main(String[] args) {

        List<String> wordArray = new ArrayList<String>();
        wordArray = ArrayOperation.fillTheArray(wordArray);
        System.out.println(wordArray + "\n");
        ArrayOperation.printUniqueWords(wordArray);
        wordArray.clear();
        try {
            wordArray = ArrayOperation.fillTheArrayFromFile(wordArray, FILE_NAME2);
        } catch (IOException e) {
            System.out.println("Failed to fill array from file!\n");
        }
        try {
            wordArray = ArrayOperation.fillTheArrayFromFile(wordArray, FILE_NAME1);
        } catch (IOException e) {
            System.out.println("Failed to fill array from file!\n");
        }
        System.out.println(wordArray + "\n");
        ArrayOperation.printUniqueWords(wordArray);

        Phonebook phonebook = new Phonebook();

        phonebook.add(2304578, "Ivanova");
        phonebook.add(5678794, "Ivanova");
        phonebook.add(3456783, "Petrova");
        phonebook.add(3456278, "Sidorova");
        phonebook.add(9786053, "Sidorova");
        phonebook.add(6475893, "Sidorova");

        phonebook.get("Ivanova");
        phonebook.get("Petrova");
        phonebook.get("Sidorova");
        phonebook.get("Petrushkin");
    }
}

