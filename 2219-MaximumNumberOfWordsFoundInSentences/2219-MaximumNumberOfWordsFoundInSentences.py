# Last updated: 9/3/2025, 5:27:37 PM
class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        l=[]
        ans=0
        for s in sentences:
            ans=max(ans ,len(s.split()))
        return ans