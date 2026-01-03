# Last updated: 1/3/2026, 8:17:52 PM
1class Solution:
2    def reversePrefix(self, s: str, k: int) -> str:
3        return str(s[:k])[::-1]+s[k:]
4        