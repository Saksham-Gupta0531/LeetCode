// Last updated: 2/4/2026, 12:26:12 PM
class Solution {
    public String removeSubstring(String s, int k) {
        // stack
        Stack<Character> chars = new Stack<>();
        Stack<Integer> counts = new Stack<>();
        for (int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (!chars.isEmpty() && c == chars.peek()) {
                counts.push(counts.pop()+1);
            }
            else {
                chars.push(c);
                counts.push(1);
            }

            if (chars.size() >= 2 && chars.peek() == ')' && counts.peek() == k) {
                int curCount = counts.pop();
                char curChar = chars.pop();

                int prevCount = counts.pop();
                char prevChar = chars.pop();

                if (prevCount >= k) {
                    if (prevCount - k > 0) {
                        chars.push(prevChar);
                        counts.push(prevCount - k);
                    }
                }
                else {
                    chars.push(prevChar);
                    counts.push(prevCount);
                    counts.push(curCount);
                    chars.push(curChar);
                }
            }
        }

        String res = "";
        while (!chars.isEmpty()) {
            int freq = counts.pop();
            String c = "" + chars.pop();
            res = c.repeat(freq) + res;
        }
        return res;
    }
}