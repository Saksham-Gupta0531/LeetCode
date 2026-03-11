// Last updated: 3/11/2026, 10:38:17 AM
1class Solution {
2    public int countBinarySubstrings(String s) {
3        int r = 0;
4        int prev = 0;
5        int ans = 0;
6        while (r < s.length()) {
7            char k = s.charAt(r);
8            int curr = 0;
9            while (r < s.length() && s.charAt(r) == k) {
10                r++;
11                curr++;
12            }
13            System.out.println(prev + " " + curr);
14            ans += Math.min(curr, prev);
15            prev = curr;
16        }
17        return ans;
18    }
19}