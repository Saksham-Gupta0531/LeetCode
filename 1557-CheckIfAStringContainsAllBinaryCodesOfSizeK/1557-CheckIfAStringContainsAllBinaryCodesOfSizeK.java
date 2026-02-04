// Last updated: 2/4/2026, 12:29:32 PM
class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set = new HashSet<>() ;
        int S= 0;
        int l= k;
        while (S<l && l<=s.length()){
            set.add(s.substring(S,l));
            l++;
            S++;
        }
        if (set.size()== Math.pow(2,k))
            return true;
        else 
            return false;
    }
}