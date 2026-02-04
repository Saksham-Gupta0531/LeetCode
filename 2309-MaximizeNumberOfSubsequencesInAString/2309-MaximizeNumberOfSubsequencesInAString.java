// Last updated: 2/4/2026, 12:28:21 PM
class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        long total = 0;
        long countA = 0;
        long countB = 0;

        char p0 = pattern.charAt(0);
        char p1 = pattern.charAt(1);

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == p1) {
                total += countA;
                countB++;
            }
            if (c == p0) {
                countA++;
            }
        }

        return total + Math.max(countA, countB);
    }
}
