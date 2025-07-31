# Last updated: 7/31/2025, 12:28:29 PM
class Solution:
    def maxScore(self, s: str) -> int:
        l=[]
        for i in range(1,len(s)):
            
            x=s[:i].count('0')
            y=s[i:].count('1')
            if(s[i]==0):
                x=x+1
            l.append(x+y)
        return max(l)