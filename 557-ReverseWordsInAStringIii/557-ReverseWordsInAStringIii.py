# Last updated: 7/31/2025, 12:29:15 PM
class Solution:
    def reverseWords(self, s: str) -> str:
        s=s.split()
        for i in range(len(s)):
            s[i]=s[i][::-1]
        
        s =" ".join(s)
        return s
        