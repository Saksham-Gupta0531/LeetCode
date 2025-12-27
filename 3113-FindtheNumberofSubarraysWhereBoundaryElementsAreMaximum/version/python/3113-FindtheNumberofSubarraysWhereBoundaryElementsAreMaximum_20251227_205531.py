# Last updated: 12/27/2025, 8:55:31 PM
1class Solution:
2    def numberOfSubarrays(self, nums: List[int]) -> int:
3        a, answer = [], 0
4        
5        
6        for i in nums:
7            while len(a) and a[-1][0] < i:
8                a.pop()
9            if len(a) == 0 or a[-1][0] > i:
10                a.append([i, 0])
11            a[-1][1] += 1
12            answer += a[-1][1]
13        
14        return answer