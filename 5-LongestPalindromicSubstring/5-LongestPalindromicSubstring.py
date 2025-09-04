# Last updated: 9/4/2025, 6:16:15 AM
class Solution:
    def ispall(s:str):
        return s==s[::-1]
    def longestPalindrome(self, s: str) -> str:
        l=""
        for i in range(len(s)):
            for j in range(i,len(s)+1):
                if Solution.ispall(s[i:j]) and len(s[i:j])>len(l):
                    l=s[i:j]
        return l
    