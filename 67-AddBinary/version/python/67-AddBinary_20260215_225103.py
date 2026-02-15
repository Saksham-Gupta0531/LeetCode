# Last updated: 2/15/2026, 10:51:03 PM
1class Solution:
2    def addBinary(self, a: str, b: str) -> str:
3        a=int(a)
4        j=0
5        k=0
6        while a!=0:
7            x=a%10
8            a=a//10
9            k=k+x*(2**j)
10            j=j+1
11        
12        a=int(b)
13        j=0
14        m=0
15        while a!=0:
16            x=a%10
17            a=a//10
18            m=m+x*(2**j)
19            j=j+1
20        c=m+k
21        return bin(c)[2:]