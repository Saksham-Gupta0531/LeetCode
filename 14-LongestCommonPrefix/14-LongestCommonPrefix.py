# Last updated: 9/4/2025, 6:16:01 AM
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        s=""
        k=0
        f=1
        while True:
            if k<len(strs[0]):
                s=s+strs[0][k]
                k+=1
            else:
                break
            for i in strs:
                if s==i[0:k]:
                    continue
                else:
                    f=0
                    return s[:-1]
        return s