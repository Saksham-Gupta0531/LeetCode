# Last updated: 2/4/2026, 12:25:21 PM
class Solution:
    def reversePrefix(self, s: str, k: int) -> str:
        return str(s[:k])[::-1]+s[k:]
        