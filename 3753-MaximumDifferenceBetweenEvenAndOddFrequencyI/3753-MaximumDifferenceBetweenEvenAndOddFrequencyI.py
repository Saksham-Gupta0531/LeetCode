# Last updated: 7/31/2025, 12:27:46 PM

class Solution:
    def maxDifference(self, s: str) -> int:
        d= Counter(s)
        a1=0
        a2=999
        for k,v in d.items():
            if v%2==0:
                a2=min(a2,v)
            else:
                a1=max(a1,v)
        return a1-a2