# Last updated: 7/31/2025, 12:28:19 PM
class Solution:
    def maximumDifference(self, nums: List[int]) -> int:
        ans=0
        n=len(nums)
        mx=nums[n-1]
        for i in range(n-2,-1,-1):
            if mx<nums[i]:
                mx=nums[i]
            else:
                ans=max(ans,mx-nums[i])
        if ans==0:
            return -1
        return ans
            