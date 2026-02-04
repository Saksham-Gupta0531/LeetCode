# Last updated: 2/4/2026, 12:26:19 PM
class Solution:
    def maxTotal(self, value: List[int], limit: List[int]) -> int:

        heaps = [[] for _ in range(len(value) + 1)]

        for val, lim in zip(value, limit):

            if lim > len(heaps[lim]):
                heappush(heaps[lim], val)
            else: 
                heappushpop(heaps[lim], val)

        return sum(chain(*heaps))