package Quiz2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class JavaKeyWordCounter {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/Quiz2/Hello.java");
        Scanner scanner = new Scanner(file);
        String[] javaKeyWords = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while"};
        HashSet<String> javaKeyWordsSet = new HashSet<>(Arrays.asList(javaKeyWords));
        HashMap<String, Integer> javaKeyWordsCount = new HashMap<>();
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (javaKeyWordsSet.contains(word)) {
                if (javaKeyWordsCount.containsKey(word)) {
                    javaKeyWordsCount.put(word, javaKeyWordsCount.get(word) + 1);
                } else {
                    javaKeyWordsCount.put(word, 1);
                }
            }
        }
        TreeMap<String, Integer> sortedJavaKeyWordsCount = new TreeMap<>(javaKeyWordsCount);
        System.out.println("The Java key word count is:");
        for (String key : sortedJavaKeyWordsCount.keySet()) {
            System.out.println(key + ": " + sortedJavaKeyWordsCount.get(key));
        }
    }
}
