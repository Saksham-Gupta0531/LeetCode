# Last updated: 12/21/2025, 8:04:57 AM
1class Solution:
2    def mirrorDistance(self, n: int) -> int:
3        return abs(n - int(str(n)[::-1]))