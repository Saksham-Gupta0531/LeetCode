// Last updated: 9/4/2025, 6:16:12 AM
class Solution {
    public String longestPalindrome(String s) {
        String temp="";
        for(int i=0 ; i<s.length();i++){
            for(int j=i ;j<s.length()+1 ;j++){
                String sk=s.substring(i,j);
                //System.out.println(ispall(sk)+"*"+sk);
                if (ispall(s, i, j - 1) && temp.length() <sk.length()){
                    temp= sk;
                    //System.out.println(temp);

                }
            }
        }
        return temp;
    }
    public static boolean ispall(String s, int left, int right){
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}