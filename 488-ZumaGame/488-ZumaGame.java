// Last updated: 2/4/2026, 12:31:49 PM
class Solution {
    Map<String, Integer> m = new HashMap<>();
    public int findMinStep(String board, String hand) {
        char[] h = hand.toCharArray();
        Arrays.sort(h);
        int res = dfs(board, new String(h));
        return res > 5 ? -1 : res;
    }
    private int dfs(String b, String h) {
        b = clean(b);
        if (b.isEmpty()) return 0;
        if (h.isEmpty()) return 6;
        String key = b + " " + h;
        if (m.containsKey(key)) return m.get(key);
        int res = 6;
        for (int i = 0; i < b.length(); i++) {
            for (int j = 0; j < h.length(); j++) {
                if (j > 0 && h.charAt(j) == h.charAt(j - 1)) continue;
                char c = h.charAt(j);
                if (b.charAt(i) == c || (i > 0 && b.charAt(i) == b.charAt(i - 1))) {
                    String nb = b.substring(0, i) + c + b.substring(i);
                    String nh = h.substring(0, j) + h.substring(j + 1);
                    res = Math.min(res, 1 + dfs(nb, nh));
                }
            }
        }
        m.put(key, res);
        return res;
    }
    private String clean(String s) {
        for (int i = 0, j = 0; j <= s.length(); j++) {
            if (j == s.length() || s.charAt(j) != s.charAt(i)) {
                if (j - i >= 3) return clean(s.substring(0, i) + s.substring(j));
                i = j;
            }
        }
        return s;
    }
}