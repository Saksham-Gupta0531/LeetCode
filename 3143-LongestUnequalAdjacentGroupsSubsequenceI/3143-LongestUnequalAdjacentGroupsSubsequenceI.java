// Last updated: 2/4/2026, 12:27:23 PM
class Solution {
    
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ans = new ArrayList<>();
        int last =0;
        ans.add(words[0]);
        for ( int  i =1 ; i <words.length ;i++){
            if ( groups[last]!=groups[i]){
                last = i;
                ans.add(words[i]);
            }
        }
        return ans;
    }
}