// Last updated: 7/31/2025, 12:29:57 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        if(n%3==0){
            return isPowerOfThree(n/3);
        }
        return false;
    }
}