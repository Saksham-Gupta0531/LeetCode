// Last updated: 10/15/2025, 6:37:01 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) return true ;
        if (n> 1 && n%2 ==0) return isPowerOfTwo(n/2);
        else return false ;
    }
}