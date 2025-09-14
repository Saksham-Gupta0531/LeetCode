# Last updated: 9/14/2025, 11:34:22 PM
class Solution:
    def smallestAbsent(self, nums: List[int]) -> int:
        avg= 0
        d=set()
        for i in nums:
            avg+=i
            if (i>0):
                d.add(i)
        avg=max(1,int(avg/len(nums))+1)
        while avg in d:
            avg+=1
        return avg