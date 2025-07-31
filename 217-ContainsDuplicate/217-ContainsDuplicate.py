# Last updated: 7/31/2025, 12:30:17 PM
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        x=set(nums)
        return len(x)!=len(nums)
           