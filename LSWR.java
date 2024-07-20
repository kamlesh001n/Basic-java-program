import java.util.HashMap;
import java.util.Map;

public class LSWR {
    public static void main(String[] args) {
        String input = "abcabcda12bcdebb"; 
        String longestSubstring = find(input);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
    }

    public static String find(String s) {
        int n = s.length();
        int maxLength = 0;
        int start = 0;
        int startOfLongest = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);

            if (map.containsKey(currentChar)) {
                start = Math.max(map.get(currentChar) + 1, start);
            }
            map.put(currentChar, i);

            if (i - start + 1 > maxLength) {
                maxLength = i - start + 1;
                startOfLongest = start;
            }
        }

        return s.substring(startOfLongest, startOfLongest + maxLength);
    }
}
