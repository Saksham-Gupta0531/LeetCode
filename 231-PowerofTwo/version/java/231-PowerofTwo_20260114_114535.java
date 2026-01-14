// Last updated: 1/14/2026, 11:45:35 AM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if (n<=0) return false;
4       
5        return (n &(n-1)) ==0; 
6    }
7}