// Last updated: 2/4/2026, 12:27:20 PM
class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int len = 0;
        for (int  i= 0 ; i< Math.min(s1.length(),Math.min(s2.length(),s3.length())); i++){
            if (s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) len++;
            else break;
        }
    return (len==0)?-1 :(s1.length()+s2.length()+s3.length()-3*len);
    }
}