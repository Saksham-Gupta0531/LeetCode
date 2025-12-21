# Last updated: 12/21/2025, 8:17:05 AM
1class Solution:
2    def minCost(self, s: str, cost: List[int]) -> int:
3        t= sum(cost)
4        dic = defaultdict(int)
5
6        for ch ,val in zip( s, cost):
7            dic[ch] += val
8        return t- max(dic.values())