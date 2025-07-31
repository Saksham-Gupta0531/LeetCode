# Last updated: 7/31/2025, 12:28:37 PM
from typing import List

class Solution:
    def findOcurrences(self, text: str, first: str, second: str) -> List[str]:
        words = text.split()
        l = []
        
        for i in range(len(words) - 2):
            if words[i] == first and words[i + 1] == second:
                l.append(words[i + 2])
        
        return l
