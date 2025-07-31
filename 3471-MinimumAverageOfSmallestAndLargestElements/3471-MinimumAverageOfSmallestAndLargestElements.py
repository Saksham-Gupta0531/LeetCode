# Last updated: 7/31/2025, 12:28:01 PM
class Solution:
    def minimumAverage(self, nums: List[int]) -> float:
        avg =[]
        while nums!=[]:
            a= (max(nums)+min(nums))/2
            avg.append(a)
            nums.remove(max(nums))
            nums.remove(min(nums))
        return min(avg)

