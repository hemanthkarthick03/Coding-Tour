import java.util.*;

public class AnagramGrouper {

    public static void main(String[] args) {
        String[] words = { "listen", "silent", "enlisted", "eat", "tea", "ate" };

        Map<String, List<String>> anagramGroups = groupAnagrams(words);

        // Print the groups
        for (Map.Entry<String, List<String>> group : anagramGroups.entrySet()) {
            System.out.println(group.getKey() + '-' + group.getValue());
        }
    }

    public static Map<String, List<String>> groupAnagrams(String[] words) {

        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : words) {
            // Sort the characters of the word to create a canonical form
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // Add to the corresponding list in the map
            if (!anagramGroups.containsKey(sortedWord)) {
                anagramGroups.put(sortedWord, new ArrayList<>());
            }
            anagramGroups.get(sortedWord).add(word);
        }

        return anagramGroups;
    }
}
