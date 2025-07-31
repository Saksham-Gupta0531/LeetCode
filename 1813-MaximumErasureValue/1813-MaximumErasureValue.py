# Last updated: 7/31/2025, 12:28:23 PM
class Solution:
    def maximumUniqueSubarray(self, nums: List[int]) -> int:
        res = set()
        l=0
        summ = 0
        maxx = 0
        for r in range(len(nums)):
            while nums[r] in res:
                res.remove(nums[l])
                summ -= nums[l]
                l += 1
            res.add(nums[r])
            summ += nums[r]
            maxx = max(maxx, summ)

        return maxx