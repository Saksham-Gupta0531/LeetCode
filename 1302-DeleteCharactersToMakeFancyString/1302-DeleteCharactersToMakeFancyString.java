// Last updated: 7/31/2025, 12:28:36 PM
class Solution {
    public String makeFancyString(String s) {
        StringBuilder ns = new StringBuilder();
        ns.append(s.charAt(0));
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (count >= 1 && s.charAt(i) == s.charAt(i - 1)) {
                continue;
            } else if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 0;
            }
            ns.append(s.charAt(i));
        }

        return ns.toString();
    }
}
