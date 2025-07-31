# Last updated: 7/31/2025, 12:29:56 PM
class Solution:
    def reverseString(self, s: List[str]) -> None:
      left=0
      right=len(s)-1
      while left <= right :
            s[left],s[right]=s[right],s[left]
            left+=1
            right-=1
        