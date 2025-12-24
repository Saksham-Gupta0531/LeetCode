// Last updated: 12/24/2025, 3:46:25 PM
1class Solution {
2    public int findMinimumOperations(String s1, String s2, String s3) {
3        int len = 0;
4        for (int  i= 0 ; i< Math.min(s1.length(),Math.min(s2.length(),s3.length())); i++){
5            if (s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) len++;
6            else break;
7        }
8    return (len==0)?-1 :(s1.length()+s2.length()+s3.length()-3*len);
9    }
10}