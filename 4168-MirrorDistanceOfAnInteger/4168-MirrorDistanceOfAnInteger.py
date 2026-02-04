# Last updated: 2/4/2026, 12:25:22 PM
class Solution:
    def mirrorDistance(self, n: int) -> int:
        return abs(n - int(str(n)[::-1]))