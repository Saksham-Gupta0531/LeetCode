// Last updated: 7/31/2025, 12:29:51 PM
class Solution {
    public boolean isPowerOfFour(int n) {
      if(n<=0) return false;
        if(n==1) return true;
        if(n%4==0){
            return isPowerOfFour(n/4);
        }
        return false;
    }
    
}