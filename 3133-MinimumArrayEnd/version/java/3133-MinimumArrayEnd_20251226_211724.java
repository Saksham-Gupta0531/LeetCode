// Last updated: 12/26/2025, 9:17:24 PM
1class Solution {
2    public long minEnd(int n, int x) {
3        long result = x;
4        long remaining = n - 1;
5        long position = 1;
6        
7        while (remaining != 0) {
8            if ((x & position) == 0) {
9                result |= (remaining & 1) * position;
10                remaining >>= 1;
11            }
12            position <<= 1;
13        }
14        
15        return result;
16    }
17}