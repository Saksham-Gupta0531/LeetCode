# Last updated: 2/4/2026, 12:25:27 PM
class Solution:
    def minCost(self, s: str, cost: List[int]) -> int:
        t= sum(cost)
        dic = defaultdict(int)

        for ch ,val in zip( s, cost):
            dic[ch] += val
        return t- max(dic.values())