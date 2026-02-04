# Last updated: 2/4/2026, 12:29:20 PM
class Solution:
    def numWays(self, s: str) -> int:
        n,o = len(s),[]
        for i,val in enumerate(s):
            if val == '1':
                o.append(i)
        total = len(o)
        if total == 0:
		   
            return ((n-1)*(n-2)//2) % (10**9+7) 
        if total % 3 != 0:
            return 0
        target = total // 3
        return (o[target]-o[target-1])*(o[target*2]-o[target*2-1])%(10**9+7)