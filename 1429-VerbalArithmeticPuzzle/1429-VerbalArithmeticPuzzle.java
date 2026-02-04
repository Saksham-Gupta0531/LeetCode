// Last updated: 2/4/2026, 12:29:45 PM
import java.util.*;

class Solution {
    String[] words;
    String result;

    public boolean isSolvable(String[] words, String result) {
        this.words = words;
        this.result = result;

        boolean[] used = new boolean[10];
        int[] map = new int[128];

        Set<Character> starts = new HashSet<>();
        Set<Character> all = new HashSet<>();

        for (String word : words) {
            if (word.length() > 1) {
                starts.add(word.charAt(0));
            }
            for (char c : word.toCharArray()) {
                all.add(c);
            }
        }

        if (result.length() > 1) {
            starts.add(result.charAt(0));
        }
        for (char c : result.toCharArray()) {
            all.add(c);
        }

        char[] arr = new char[all.size()];
        int idx = 0;
        for (char c : all) {
            arr[idx++] = c;
        }

        return dfs(arr, starts, map, used, 0);
    }

    private boolean dfs(char[] arr, Set<Character> starts,
                        int[] map, boolean[] used, int pos) {

        if (pos == arr.length) {
            return calculate(map);
        }

        char ch = arr[pos];

        for (int d = 0; d < 10; d++) {
            if (used[d]) continue;
            if (d == 0 && starts.contains(ch)) continue;

            map[ch] = d;
            used[d] = true;

            if (dfs(arr, starts, map, used, pos + 1)) {
                return true;
            }

            used[d] = false;
            map[ch] = 0;
        }
        return false;
    }

    private boolean calculate(int[] map) {
        int sum = 0;

        for (String word : words) {
            int num = 0;
            for (char c : word.toCharArray()) {
                num = num * 10 + map[c];
            }
            sum += num;
        }

        int res = 0;
        for (char c : result.toCharArray()) {
            res = res * 10 + map[c];
        }

        return sum == res;
    }
}
