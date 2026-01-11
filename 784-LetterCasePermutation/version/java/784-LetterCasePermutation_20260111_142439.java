// Last updated: 1/11/2026, 2:24:39 PM
1class Solution {
2    public List<String> letterCasePermutation(String s) {
3        List<String> lst = new ArrayList<>();
4        StringBuilder sb = new StringBuilder();
5        addAns(s, 0, sb, lst);
6        return lst;
7    }
8
9    public void addAns(String s, int i, StringBuilder sb, List<String> lst) {
10        if (s.length() == sb.length()) {
11            lst.add(sb.toString());
12            return;
13        }
14
15        if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
16            sb.append(s.charAt(i));
17            // System.out.print(sb + "   ");
18            addAns(s, i + 1, sb, lst);
19            sb.deleteCharAt(sb.length() - 1);
20        } else {
21            sb.append(Character.toLowerCase(s.charAt(i)));
22            addAns(s, i + 1, sb, lst);
23            sb.deleteCharAt(sb.length() - 1);
24
25            sb.append(Character.toUpperCase(s.charAt(i)));
26            addAns(s, i + 1, sb, lst);
27            sb.deleteCharAt(sb.length() - 1);
28        }
29
30    }
31}