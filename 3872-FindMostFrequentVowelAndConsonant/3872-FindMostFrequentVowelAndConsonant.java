// Last updated: 9/13/2025, 2:20:34 PM
class Solution {
    public int maxFreqSum(String s) {
        int[] ar = new int[26];
        int mv=0;
        int mc=0;
        for (int i =0 ; i< s.length() ; i++ ){
            char c= s.charAt(i) ;
            int  p= c-'a' ;
            ar[p]++;
            if(c == 'a' || c=='e' || c=='i' || c=='o' ||  c=='u')
                mv= Math.max(mv,ar[p]);            
            else mc =  Math.max(mc,ar[p]);
        }
        return mv+mc;
        

    }
}