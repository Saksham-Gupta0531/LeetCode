// Last updated: 12/28/2025, 10:29:17 PM
1import java.util.*;
2
3class Solution {
4    public String minimizeStringValue(String s) {
5        int n = s.length();
6        int[] freq = new int[26]; 
7        List<Integer> questionMarks = new ArrayList<>(); 
8        StringBuilder sb = new StringBuilder(s);
9
10        for (int i = 0; i < n; i++) {
11            char ch = s.charAt(i);
12            if (ch != '?') {
13                freq[ch - 'a']++;
14            } else {
15                questionMarks.add(i);
16            }
17        }
18
19        List<Character> replacements = new ArrayList<>();
20        for (int i = 0; i < questionMarks.size(); i++) {
21            char toReplace = findCharWithMinFrequency(freq);
22            replacements.add(toReplace);
23            freq[toReplace - 'a']++; 
24        }
25
26        Collections.sort(replacements);
27
28        int replacementIndex = 0;
29        for (int idx : questionMarks) {
30            sb.setCharAt(idx, replacements.get(replacementIndex++));
31        }
32
33        return sb.toString();
34    }
35
36    private char findCharWithMinFrequency(int[] freq) {
37        int minFreq = Integer.MAX_VALUE;
38        char result = 'a';
39
40        for (int i = 0; i < 26; i++) {
41            if (freq[i] < minFreq) {
42                minFreq = freq[i];
43                result = (char) (i + 'a');
44            }
45        }
46
47        return result;
48    }
49}