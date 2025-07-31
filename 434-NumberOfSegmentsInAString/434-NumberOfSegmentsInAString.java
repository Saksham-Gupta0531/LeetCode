// Last updated: 7/31/2025, 12:29:29 PM
class Solution {
    public int countSegments(String s) {
        if (s.trim().length() == 0 || s == null) 
            return 0;
        else {
            String[] strs = s.trim().split("\\s+");
            return strs.length;
        }
    }
}