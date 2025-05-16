package Week_1;
import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        // Example 1: Removing specific word from a list
        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "apple"));
        System.out.println("Original list: " + words);

        // Using iterator to remove "apple"
        Iterator<String> wordIterator = words.iterator();
        while (wordIterator.hasNext()) {
            if (wordIterator.next().equals("apple")) {
                wordIterator.remove();
            }
        }
        System.out.println("List after removing 'apple': " + words);

        // Example 2: Removing specific character from strings in a list
        List<String> sentences = new ArrayList<>(Arrays.asList("hello", "world", "java", "iterator"));
        System.out.println("Original list: " + sentences);

        // Using iterator to remove 'o' from each string
        List<String> modifiedSentences = new ArrayList<>();
        for (String sentence : sentences) {
            StringBuilder modified = new StringBuilder();
            for (char ch : sentence.toCharArray()) {
                if (ch != 'o') modified.append(ch);
            }
            modifiedSentences.add(modified.toString());
        }

        System.out.println("List after removing 'o' from each string: " + modifiedSentences);
    }
}
