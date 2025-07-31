# Last updated: 7/31/2025, 12:27:49 PM
from typing import List

class Solution:
    def partitionString(self, s: str) -> List[str]:
        seen = set()
        result = []
        i = 0
        n = len(s)
    
        while i < n:
            segment = ""
            for j in range(i, n):
                segment += s[j]
                if segment not in seen:
                    result.append(segment)
                    seen.add(segment)
                    i = j + 1  # move to the next character after this segment
                    break
            else:
                
                i += 1
    
        return result
