# Last updated: 12/20/2025, 6:16:30 PM
1class Solution:
2    def repeatedStringMatch(self, a: str, b: str) -> int:
3        s= 0
4        S= a*(len(b)//len(a))
5        if (b in S ):
6            return len(b)//len(a)
7        elif (b in S+a):
8            return len(b)//len(a) +1
9        elif (b in S+a+a):
10            return len(b)//len(a) +2
11        elif (b in S+a+a+a):
12            return len(b)//len(a) +3
13        else :
14            return -1