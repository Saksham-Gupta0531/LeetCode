# Last updated: 9/4/2025, 6:16:07 AM
class Solution:
    def isPalindrome(self, x: int) -> bool:
        s=str(x)
        s= s[::-1]
        if str(x)==s:
            return True
        else:
            return False