# Last updated: 1/23/2026, 11:41:04 PM
1class Solution:
2    def maxTotal(self, value: List[int], limit: List[int]) -> int:
3
4        heaps = [[] for _ in range(len(value) + 1)]
5
6        for val, lim in zip(value, limit):
7
8            if lim > len(heaps[lim]):
9                heappush(heaps[lim], val)
10            else: 
11                heappushpop(heaps[lim], val)
12
13        return sum(chain(*heaps))