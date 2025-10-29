# Last updated: 10/30/2025, 12:15:28 AM
class Solution:
    def smallestNumber(self, n: int) -> int:
        return (1<<(1+int(log2(n))))-1
        