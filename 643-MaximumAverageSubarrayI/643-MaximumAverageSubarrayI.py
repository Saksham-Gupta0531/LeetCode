# Last updated: 9/8/2025, 11:53:27 PM
class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        avg=0
        for i in range(k):
            avg+=nums[i]
        pt=avg
        for i in range(k,len(nums)):
            avg= avg -nums[i-k]+nums[i]
            pt = max(pt,avg)
        return pt/k
        
    
