// Last updated: 2/4/2026, 12:28:32 PM
class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String ,Integer>h1= new HashMap<>();
        HashMap<String ,Integer>h2= new HashMap<>();
        for (String w : words1) {
            h1.put(w, h1.getOrDefault(w, 0) + 1);
        }
        for (String w : words2) {
            h2.put(w, h2.getOrDefault(w, 0) + 1);
        }
        int c=0;
        for (String s : h1.keySet()) {
            if (h1.get(s) == 1 && h2.containsKey(s) && h2.get(s) == 1) {
                c++;
            }
        }
        return c;
    }
}