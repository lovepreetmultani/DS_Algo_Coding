import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCounter {
    public static void main(String[] args) {
        try {
            // Read the file
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line).append(" ");
            }
            reader.close();

            // Split the content into words and count occurrences
            Map<String, Long> wordCount = Arrays.stream(content.toString().toLowerCase().split("\\s+"))
                    .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

            // Sort the words by frequency in descending order
            wordCount.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
