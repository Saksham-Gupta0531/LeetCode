// Last updated: 1/19/2026, 12:10:25 AM
1class Solution {
2    public String longestPalindrome(String s) {
3        String temp="";
4        for(int i=0 ; i<s.length();i++){
5            for(int j=i ;j<s.length()+1 ;j++){
6                String sk=s.substring(i,j);
7                //System.out.println(ispall(sk)+"*"+sk);
8                if (ispall(s, i, j - 1) && temp.length() <sk.length()){
9                    temp= sk;
10                    //System.out.println(temp);
11
12                }
13            }
14        }
15        return temp;
16    }
17    public static boolean ispall(String s, int left, int right){
18        while (left < right) {
19            if (s.charAt(left++) != s.charAt(right--)) return false;
20        }
21        return true;
22    }
23}