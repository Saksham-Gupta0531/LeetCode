// Last updated: 7/31/2025, 12:29:08 PM
public class Solution {

    public char nextGreatestLetter(char[] letters, char target) {
        return search(letters, target);
    }

    public static char search(char[] letters, char target) {
        int first = 0;
        int last = letters.length - 1;

        if (target >= letters[last]) {
            return letters[0];
        }

        while (first <= last) {
            int mid = (first + last) / 2;

            if (letters[mid] > target) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }

        return letters[first];
    }
}
