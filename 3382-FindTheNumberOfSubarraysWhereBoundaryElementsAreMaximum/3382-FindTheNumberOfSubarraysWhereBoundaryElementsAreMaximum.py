# Last updated: 2/4/2026, 12:27:12 PM
class Solution:
    def numberOfSubarrays(self, nums: List[int]) -> int:
        a, answer = [], 0
        
        
        for i in nums:
            while len(a) and a[-1][0] < i:
                a.pop()
            if len(a) == 0 or a[-1][0] > i:
                a.append([i, 0])
            a[-1][1] += 1
            answer += a[-1][1]
        
        return answer