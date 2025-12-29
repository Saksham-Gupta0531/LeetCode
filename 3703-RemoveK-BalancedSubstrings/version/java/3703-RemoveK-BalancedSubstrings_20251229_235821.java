// Last updated: 12/29/2025, 11:58:21 PM
1class Solution {
2    public String removeSubstring(String s, int k) {
3        // stack
4        Stack<Character> chars = new Stack<>();
5        Stack<Integer> counts = new Stack<>();
6        for (int i = 0; i<s.length(); i++) {
7            char c = s.charAt(i);
8            if (!chars.isEmpty() && c == chars.peek()) {
9                counts.push(counts.pop()+1);
10            }
11            else {
12                chars.push(c);
13                counts.push(1);
14            }
15
16            if (chars.size() >= 2 && chars.peek() == ')' && counts.peek() == k) {
17                int curCount = counts.pop();
18                char curChar = chars.pop();
19
20                int prevCount = counts.pop();
21                char prevChar = chars.pop();
22
23                if (prevCount >= k) {
24                    if (prevCount - k > 0) {
25                        chars.push(prevChar);
26                        counts.push(prevCount - k);
27                    }
28                }
29                else {
30                    chars.push(prevChar);
31                    counts.push(prevCount);
32                    counts.push(curCount);
33                    chars.push(curChar);
34                }
35            }
36        }
37
38        String res = "";
39        while (!chars.isEmpty()) {
40            int freq = counts.pop();
41            String c = "" + chars.pop();
42            res = c.repeat(freq) + res;
43        }
44        return res;
45    }
46}