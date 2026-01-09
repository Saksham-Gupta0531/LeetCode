# Last updated: 1/9/2026, 10:34:49 PM
1class Solution:
2    def getWordsInLongestSubsequence(self, w: List[str], g: List[int]) -> List[str]:
3        dp = []
4        for s,g1 in zip(w,g):
5            dp.append(max((q for t,g2,q in zip(w,g,dp) 
6                    if g1!=g2 and len(s)==len(t) and sum(map(ne,s,t))<2),
7                key=len,default=[]) + [s])
8        
9        return max(dp,key=len)