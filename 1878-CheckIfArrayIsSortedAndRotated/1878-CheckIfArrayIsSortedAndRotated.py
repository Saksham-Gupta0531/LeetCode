# Last updated: 9/3/2025, 5:27:46 PM
class Solution:
    def check(self, nums: List[int]) -> bool:
        t=0
        for i in range(1,len(nums)):
            if nums[i]>=nums[i-1]:
                continue 
            else :
                if t<1:
                    t+=1
                    if (nums[-1]<= nums[0]):
                        continue 
                    return False
                else:
                    return False
        return True