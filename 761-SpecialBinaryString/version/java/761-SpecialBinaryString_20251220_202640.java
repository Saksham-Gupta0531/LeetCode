// Last updated: 12/20/2025, 8:26:40 PM
1class Solution {
2        public String makeLargestSpecial(String S) {
3        
4        int balance = 0, l = 0;
5        List<String> subResults = new LinkedList<>();
6        for (int r = 0; r < S.length(); r++) {
7            if (S.charAt(r) == '0') {
8                balance--;
9            }
10            else {
11                balance++;
12            }
13            if (balance == 0) {
14                subResults.add("1" + makeLargestSpecial(S.substring(l + 1, r)) + "0");
15                l = r + 1;
16            }
17        }
18        Collections.sort(subResults, Collections.reverseOrder());
19        
20        return String.join("", subResults);
21    }
22}