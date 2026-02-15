# Last updated: 2/15/2026, 11:04:22 PM
1class Solution:
2    def trailingZeroes(self, n: int) -> int:
3        x=5
4        a=n//5
5        c=n//5
6        while a!=0:
7            
8            x=x*5
9            a=n//x
10            c+=a
11        
12        return c
13