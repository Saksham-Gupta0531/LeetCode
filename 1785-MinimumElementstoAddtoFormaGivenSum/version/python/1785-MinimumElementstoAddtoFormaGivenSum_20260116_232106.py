# Last updated: 1/16/2026, 11:21:06 PM
1class Solution:
2    def minElements(self, nums: List[int], limit: int, goal: int) -> int:
3        return math.ceil(abs(goal - sum(nums)) / limit)