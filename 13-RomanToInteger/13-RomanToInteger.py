# Last updated: 9/4/2025, 6:16:02 AM
class Solution:
    def romanToInt(self, s: str) -> int:
        d={"I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000}
        l=1
        val=0
        for i in range(len(s)-1,-1,-1):
            if d[s[i]]<l:
                val=val-d[s[i]]
            else:
                val=val+d[s[i]]
                l=d[s[i]]
        return val

