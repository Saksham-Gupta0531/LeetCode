// Last updated: 12/24/2025, 4:33:19 PM
1import java.util.*;
2
3class Solution {
4    String[] words;
5    String result;
6
7    public boolean isSolvable(String[] words, String result) {
8        this.words = words;
9        this.result = result;
10
11        boolean[] used = new boolean[10];
12        int[] map = new int[128];
13
14        Set<Character> starts = new HashSet<>();
15        Set<Character> all = new HashSet<>();
16
17        for (String word : words) {
18            if (word.length() > 1) {
19                starts.add(word.charAt(0));
20            }
21            for (char c : word.toCharArray()) {
22                all.add(c);
23            }
24        }
25
26        if (result.length() > 1) {
27            starts.add(result.charAt(0));
28        }
29        for (char c : result.toCharArray()) {
30            all.add(c);
31        }
32
33        char[] arr = new char[all.size()];
34        int idx = 0;
35        for (char c : all) {
36            arr[idx++] = c;
37        }
38
39        return dfs(arr, starts, map, used, 0);
40    }
41
42    private boolean dfs(char[] arr, Set<Character> starts,
43                        int[] map, boolean[] used, int pos) {
44
45        if (pos == arr.length) {
46            return calculate(map);
47        }
48
49        char ch = arr[pos];
50
51        for (int d = 0; d < 10; d++) {
52            if (used[d]) continue;
53            if (d == 0 && starts.contains(ch)) continue;
54
55            map[ch] = d;
56            used[d] = true;
57
58            if (dfs(arr, starts, map, used, pos + 1)) {
59                return true;
60            }
61
62            used[d] = false;
63            map[ch] = 0;
64        }
65        return false;
66    }
67
68    private boolean calculate(int[] map) {
69        int sum = 0;
70
71        for (String word : words) {
72            int num = 0;
73            for (char c : word.toCharArray()) {
74                num = num * 10 + map[c];
75            }
76            sum += num;
77        }
78
79        int res = 0;
80        for (char c : result.toCharArray()) {
81            res = res * 10 + map[c];
82        }
83
84        return sum == res;
85    }
86}
87