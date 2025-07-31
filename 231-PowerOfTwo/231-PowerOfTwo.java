// Last updated: 7/31/2025, 12:30:14 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return( n>0 &&(n & n - 1) == 0 );
    }
}