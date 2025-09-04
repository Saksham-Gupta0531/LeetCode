# Last updated: 9/4/2025, 6:14:49 AM
class Solution:
    def isPalindrome(self, s: str) -> bool:
        k=""
        for i in range(len(s)):
            if s[i].isalnum():
                k=k+s[i].lower()
        if k==k[::-1]:
            return True
        else:
            return False