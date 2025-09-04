# Last updated: 9/4/2025, 6:15:23 AM
class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        l=s.strip().split(" ")
       
        return len(l[-1])
        