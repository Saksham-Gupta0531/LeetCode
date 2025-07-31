// Last updated: 7/31/2025, 12:29:39 PM
class Solution {
    public int firstUniqChar(String s, int j) {
        if (j >= s.length()) {
            return -1;
        }
        
        char x = s.charAt(j);
        boolean isUnique = true;

        for (int i = 0; i < s.length(); i++) {
            if (i != j && s.charAt(i) == x) {
                isUnique = false;
                break;
            }
        }

        if (isUnique) {
            return j;
        }

        return firstUniqChar(s, j + 1);
    }

    public int firstUniqChar(String s) {
        return firstUniqChar(s, 0);
    }
}
