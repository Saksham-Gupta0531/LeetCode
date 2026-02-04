# Last updated: 2/4/2026, 12:26:43 PM
class Solution:
    def smallestNumber(self, n: int) -> int:
        return (1<<(1+int(log2(n))))-1
        