// Last updated: 12/28/2025, 10:10:20 PM
1class Solution {
2    public long maximumSubsequenceCount(String text, String pattern) {
3        long total = 0;
4        long countA = 0;
5        long countB = 0;
6
7        char p0 = pattern.charAt(0);
8        char p1 = pattern.charAt(1);
9
10        for (int i = 0; i < text.length(); i++) {
11            char c = text.charAt(i);
12
13            if (c == p1) {
14                total += countA;
15                countB++;
16            }
17            if (c == p0) {
18                countA++;
19            }
20        }
21
22        return total + Math.max(countA, countB);
23    }
24}
25