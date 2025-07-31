// Last updated: 7/31/2025, 12:28:16 PM
class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        int n = word.length();
        
        for (int i = 0; i < n; i++) {
            if (!isVowel(word.charAt(i))) continue;
            Set<Character> set = new HashSet<>();
            for (int j = i; j < n; j++) {
                char ch = word.charAt(j);
                if (!isVowel(ch)) break;
                set.add(ch);
                if (set.size() == 5) count++;
            }
        }
        return count;
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}