// Last updated: 1/7/2026, 7:13:02 PM
1class Solution {
2    
3    public List<String> getLongestSubsequence(String[] words, int[] groups) {
4        List<String> ans = new ArrayList<>();
5        int last =0;
6        ans.add(words[0]);
7        for ( int  i =1 ; i <words.length ;i++){
8            if ( groups[last]!=groups[i]){
9                last = i;
10                ans.add(words[i]);
11            }
12        }
13        return ans;
14    }
15}