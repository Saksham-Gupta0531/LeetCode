// Last updated: 1/23/2026, 1:09:32 PM
1class Solution {
2    public int findMinStep(String board, String hand) {
3        int m = hand.length();
4        Map<Character, Integer> map = new HashMap();
5        Map<String, Integer> dp = new HashMap();
6        for(int index = 0; index < m; index += 1) {
7            map.put(hand.charAt(index), map.getOrDefault(hand.charAt(index), 0) + 1);
8        }
9        int ans = findAns(board, map, dp);
10        if(ans >= 100000) return -1;
11        return ans;
12    }
13
14    private int findAns(String board, Map<Character, Integer> hand, Map<String, Integer> dp) {
15        if(hand.size() == 0) return 100000;
16        String dpAns = board + "-" + getMapString(hand);
17        if(dp.containsKey(dpAns)) return dp.get(dpAns);
18        int ans = 100000;
19        board = correctStrin(board);
20         int n = board.length();
21        if(n == 0) return 0;
22        for(int index = 0; index < n; index += 1) {
23            for(Map.Entry<Character, Integer> entry : hand.entrySet()) {
24                char ch = entry.getKey();
25                char ch2 = board.charAt(index);
26                if( hand.get(ch) > 0 && (ch == ch2  || (index < (n - 1) && board.charAt(index) == board.charAt(index+1)))) {
27                    String newString = board.substring(0, index + 1) + ch + board.substring(index + 1 );
28                    hand.put(ch, hand.get(ch) - 1);
29                    ans = Math.min(ans, 1 + findAns(newString, hand, dp));
30                    hand.put(ch, hand.get(ch) + 1);
31                }
32            }
33        }
34
35        dp.put(dpAns, ans);
36        return ans;
37    }
38
39    private String correctStrin(String str) {
40        int n = str.length();
41        int i = 0;
42        while(i < n) {
43            char curChar = str.charAt(i);
44            int j = i + 1;
45            while(j < n) {
46                if(str.charAt(j) != curChar) {
47                    break;
48                }
49                j += 1;
50            }
51            if((j - i) >= 3) {
52                return correctStrin(str.substring(0, i) + str.substring(j));
53            }
54            i = j;
55        }
56
57        return str;
58        
59    }
60
61    char[] colors = new char[]{'R', 'Y', 'B', 'G', 'W'};
62    private String getMapString(Map<Character, Integer> hand) {
63        StringBuilder ans = new StringBuilder();
64        for(int index = 0; index < colors.length; index += 1) {
65            ans.append(hand.getOrDefault(colors[index], 0) + "-");
66        }
67        return ans.toString();
68    }
69
70}