package Quiz2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCounter {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/Quiz2/TextFile.txt");
        Scanner scanner = new Scanner(file);
        HashMap<String, Integer> words = new HashMap<>();
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (words.containsKey(word)) {
                words.put(word, words.get(word) + 1);
            } else {
                words.put(word, 1);
            }
        }
        TreeMap<String, Integer> wordCounts = new TreeMap<>(words);
        System.out.println("The word count is:");
        for (String word : wordCounts.keySet()) {
            System.out.println(word + ": " + wordCounts.get(word));
        }

    }
}
