# Last updated: 2/4/2026, 12:29:05 PM
class Solution:
    def minElements(self, nums: List[int], limit: int, goal: int) -> int:
        return math.ceil(abs(goal - sum(nums)) / limit)