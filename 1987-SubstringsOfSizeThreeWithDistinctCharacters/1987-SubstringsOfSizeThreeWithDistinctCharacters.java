// Last updated: 2/4/2026, 12:28:56 PM
class Solution {
    public int countGoodSubstrings(String S) {
        int s= 0;
        int e= 2;
        int c= 0;
        while (e<S.length()){
            if (S.charAt(s)!=S.charAt(s+1)&& S.charAt(s+1)!=S.charAt(s+2) &&S.charAt(s)!=S.charAt(s+2)){
                //System.out.print(S.charAt(s)+" " +S.charAt(s+1)+" " +S.charAt(s+2));
                c++;
            }
            s++;
            e++;
        }
    return c;
    }
}