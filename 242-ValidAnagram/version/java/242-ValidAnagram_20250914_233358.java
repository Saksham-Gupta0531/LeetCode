// Last updated: 9/14/2025, 11:33:58 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!= t.length()) return false;
        int[] fe =  new int[26];
        int[] fe2 = new int[26];
        for (int i =0 ; i<s.length(); i++){
            int p= s.charAt(i)-'a';
            //System.out.print(p+" ");
            fe[p]++;
        }
        //System.out.println();
        for (int i =0 ; i<t.length(); i++){
            int p= t.charAt(i)-'a';
           // System.out.print(p+" ");
            fe2[p]++;
        }
        for (int i =0 ;i< 26 ; i++){
            if (fe[i]!=fe2[i]) return false;
        }
        return true;
    }
}