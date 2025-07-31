# Last updated: 7/31/2025, 12:28:32 PM
from collections import Counter
class Solution:
    def findLucky(self, arr: List[int]) -> int:
        l=-1
        freq = Counter(arr)
        for key,value in freq.items():
            if key==value:
                if l<key:
                    l=key
        return l