# Last updated: 9/4/2025, 6:14:26 AM
class Solution:
    def reverseBits(self, n: int) -> int:
        s=0
        for i in range(32):
            s = s * 2 + ((n >> i) & 1)
        
        return s