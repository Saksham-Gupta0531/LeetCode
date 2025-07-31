// Last updated: 7/31/2025, 12:29:37 PM
class Solution {
    public char findTheDifference(String s, String t) {
       int[] arr1 = new int[26];
       int[] arr2 = new int[26];
       for(int i=0 ;i< s.length(); i++){
            int a= (int)( s.charAt(i)-'a');
            int b= (int) (t.charAt(i)-'a');
            arr1[a]++;
            arr2[b]++;
       }
       int b= (int) (t.charAt(t.length()-1)-'a');
       arr2[b]++;
       for(int i=0 ;i<26; i++){
            if(arr1[i]-arr2[i]!=0){
                return (char) (i+'a');
            }
       }
       return t.charAt(t.length()-1);
    }
}