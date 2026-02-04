// Last updated: 2/4/2026, 12:27:15 PM
import java.util.*;

class Solution {
    public String minimizeStringValue(String s) {
        int n = s.length();
        int[] freq = new int[26]; 
        List<Integer> questionMarks = new ArrayList<>(); 
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch != '?') {
                freq[ch - 'a']++;
            } else {
                questionMarks.add(i);
            }
        }

        List<Character> replacements = new ArrayList<>();
        for (int i = 0; i < questionMarks.size(); i++) {
            char toReplace = findCharWithMinFrequency(freq);
            replacements.add(toReplace);
            freq[toReplace - 'a']++; 
        }

        Collections.sort(replacements);

        int replacementIndex = 0;
        for (int idx : questionMarks) {
            sb.setCharAt(idx, replacements.get(replacementIndex++));
        }

        return sb.toString();
    }

    private char findCharWithMinFrequency(int[] freq) {
        int minFreq = Integer.MAX_VALUE;
        char result = 'a';

        for (int i = 0; i < 26; i++) {
            if (freq[i] < minFreq) {
                minFreq = freq[i];
                result = (char) (i + 'a');
            }
        }

        return result;
    }
}