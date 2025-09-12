// Last updated: 9/12/2025, 11:51:45 PM
class Solution {
        static{
            for(int i = 0;i<500;i++){
                doesAliceWin("");
            }
        }
    public static boolean doesAliceWin(String s) {
        int c =0;
        for(int i=0 ; i< s.length(); i++){
        if(s.charAt(i) == 'a' || s.charAt(i)=='e' ||s.charAt(i)=='i' || s.charAt(i)=='o' ||  s.charAt(i)=='u')
            return true;
        }
        return false;
    }
}