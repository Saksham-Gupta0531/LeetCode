// Last updated: 10/11/2025, 8:20:34 PM
class Solution {
    public boolean scoreBalance(String s) {
        int sum = 0;
        for(int i = 0 ; i<s.length() ;i++){
            sum =  sum + (int)(s.charAt(i) -'a')+1;
        }
        int curr  = 0;
        int j= 0;
        while (curr<= sum/2 +1){
            if( curr == sum- curr ) return true ;
            else {
                curr += (int)(s.charAt(j) -'a')+1;
            }
            
            j++;
        }
        return false ;
    }
}