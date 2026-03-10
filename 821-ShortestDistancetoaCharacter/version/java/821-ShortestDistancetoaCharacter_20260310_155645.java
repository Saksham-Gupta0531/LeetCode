// Last updated: 3/10/2026, 3:56:45 PM
1class Solution {
2    public int[] shortestToChar(String s, char c) {
3        List<Integer> ls = new ArrayList<>();
4        for (int i = 0 ; i< s.length() ; i++){
5            if ( s.charAt(i)==c) ls.add(i);
6        }
7        int[] ans = new int[s.length()];
8        int idx =0;
9        for (int i= 0 ; i < s.length(); i++){
10            
11            int val1 = Math.abs( ls.get(idx)-i);
12            int val2= Integer.MAX_VALUE;
13            if (idx!= ls.size()-1)
14            val2 = Math.abs( ls.get(idx+1)-i);
15
16            ans[i] = Math.min(val1,val2);
17            if ( val2<val1)idx++;
18        }
19    return ans;
20    }
21}