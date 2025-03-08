
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringProcessor {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi", "avocado");

        // Process the list
        List<String> result = strings.stream()
                .map(String::toUpperCase)                // Convert to uppercase
                .filter(s -> !startsWithVowel(s))         // Filter out strings starting with a vowel
                .collect(Collectors.toList());            // Collect the results into a list

        // Print the remaining strings
        result.forEach(System.out::println);
    }

    // Helper method to check if a string starts with a vowel
    private static boolean startsWithVowel(String s) {
        return s.startsWith("A") || s.startsWith("E") || s.startsWith("I") || s.startsWith("O") || s.startsWith("U");
    }
}
