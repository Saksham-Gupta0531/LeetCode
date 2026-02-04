// Last updated: 2/4/2026, 12:25:37 PM
class Solution {
    public int minLengthAfterRemovals(String s) {
      String t = s;
        int a = 0, b = 0;
        for (char c : t.toCharArray()) {
            if (c == 'a') a++;
            else b++;
        }
        return Math.abs(a - b);
    }
}