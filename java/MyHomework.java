import java.io.IOException;
import java.util.*;

public class MyHomework {
    static final String FILE_NAME1 = "C://JAVA/Java2Lesson203Homework.txt";
    static final String FILE_NAME2 = "Java2Lesson3Homework.txt";

    public static void main(String[] args) throws IOException {

        List<String> wordArray = new ArrayList<String>();
        wordArray = ArrayOperation.fillTheArray(wordArray);
        System.out.println(wordArray + "\n");
        ArrayOperation.printUniqueWords(wordArray);
        wordArray.clear();
        wordArray = ArrayOperation.fillTheArrayFromFile(wordArray, FILE_NAME2);
        wordArray = ArrayOperation.fillTheArrayFromFile(wordArray, FILE_NAME1);
        System.out.println(wordArray + "\n");
        ArrayOperation.printUniqueWords(wordArray);

        Phonebook phonebook = new Phonebook();

        phonebook.add(2304578, "Ivanov");
        phonebook.add(5678794, "Ivanov");
        phonebook.add(3456783, "Petrov");
        phonebook.add(3456278, "Sidorov");
        phonebook.add(9786053, "Sidorov");
        phonebook.add(6475893, "Sidorov");

        phonebook.get("Ivanov");
        phonebook.get("Petrov");
        phonebook.get("Sidorov");
        phonebook.get("Akulshin");
    }
}

