# Last updated: 7/31/2025, 12:27:58 PM

class Solution:
    def scoreOfString(self, s: str) -> int:
        sum=0
        for i in range(1,len(s)):
            sum=sum+abs(ord(s[i])-ord(s[i-1]))
        return sum