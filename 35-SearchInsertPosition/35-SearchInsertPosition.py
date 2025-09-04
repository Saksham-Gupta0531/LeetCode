# Last updated: 9/4/2025, 6:15:40 AM
class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        a=0
        while a<len(nums):

            if nums[a]>=target:
                return a
            
            a=a+1
        else:
            return len(nums)