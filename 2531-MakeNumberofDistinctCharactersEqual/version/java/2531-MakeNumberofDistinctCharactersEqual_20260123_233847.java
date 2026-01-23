// Last updated: 1/23/2026, 11:38:47 PM
1class Solution {
2    public boolean isItPossible(String word1, String word2) {
3        HashMap<Character, Integer> freq1 = new HashMap(), freq2 = new HashMap(); 
4        for (var ch : word1.toCharArray()) freq1.merge(ch, 1, Integer::sum); 
5        for (var ch : word2.toCharArray()) freq2.merge(ch, 1, Integer::sum); 
6        int sz1 = freq1.size(), sz2 = freq2.size(); 
7        for (char c1 = 'a'; c1 <= 'z'; ++c1) 
8            for (char c2 = 'a'; c2 <= 'z'; ++c2) 
9                if (freq1.getOrDefault(c1, 0) > 0 && freq2.getOrDefault(c2, 0) > 0) 
10                    if (c1 == c2) {
11                        if (sz1 == sz2) return true; 
12                    } else {
13                        int cnt1 = sz1, cnt2 = sz2; 
14                        if (freq1.getOrDefault(c1, 0) == 1) --cnt1; 
15                        if (freq1.getOrDefault(c2, 0) == 0) ++cnt1; 
16                        if (freq2.getOrDefault(c1, 0) == 0) ++cnt2; 
17                        if (freq2.getOrDefault(c2, 0) == 1) --cnt2; 
18                        if (cnt1 == cnt2) return true; 
19                    }
20        return false; 
21    }
22}