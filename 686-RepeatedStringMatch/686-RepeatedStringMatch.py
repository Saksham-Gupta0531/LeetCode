# Last updated: 2/4/2026, 12:30:58 PM
class Solution:
    def repeatedStringMatch(self, a: str, b: str) -> int:
        s= 0
        S= a*(len(b)//len(a))
        if (b in S ):
            return len(b)//len(a)
        elif (b in S+a):
            return len(b)//len(a) +1
        elif (b in S+a+a):
            return len(b)//len(a) +2
        
        else :
            return -1