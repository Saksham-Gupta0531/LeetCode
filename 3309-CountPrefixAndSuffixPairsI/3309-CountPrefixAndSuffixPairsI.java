// Last updated: 7/31/2025, 12:28:00 PM
class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {  
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }
    
    public boolean isPrefixAndSuffix(String word1, String word2) {
            if (word1.length() > word2.length()) 
                return false;
        
        
        String prefix = word2.substring(0, word1.length());
        String suffix = word2.substring(word2.length() - word1.length());
        
        return word1.equals(prefix) && word1.equals(suffix);
    }
}