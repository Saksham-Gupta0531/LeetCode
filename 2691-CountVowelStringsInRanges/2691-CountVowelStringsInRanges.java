// Last updated: 7/31/2025, 12:28:09 PM
import java.util.*;

class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] vowelWords = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            vowelWords[i] = check(words[i]) ? 1 : 0;
        }

        List<Integer> result = new ArrayList<>();
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            int count = 0;
            for (int i = start; i <= end; i++) {
                count += vowelWords[i];
            }
            result.add(count);
        }

        return result.stream().mapToInt(Integer::intValue).toArray(); // Convert List<Integer> to int[]
    }

    private boolean check(String s) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);
        return isVowel(first, vowels) && isVowel(last, vowels);
    }

    private boolean isVowel(char c, char[] vowels) {
        for (char vowel : vowels) {
            if (c == vowel) {
                return true;
            }
        }
        return false;
    }
}
