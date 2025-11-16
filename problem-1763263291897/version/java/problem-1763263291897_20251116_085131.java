// Last updated: 11/16/2025, 8:51:31 AM
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