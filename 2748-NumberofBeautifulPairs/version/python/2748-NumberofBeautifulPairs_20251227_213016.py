# Last updated: 12/27/2025, 9:30:16 PM
1class Solution:
2    def countBeautifulPairs(self, nums: List[int]) -> int:
3        pairs = 0
4        for i, num in enumerate(nums):
5            d = num % 10
6            for j in range(i):
7                n = nums[j]
8                while n >= 10:
9                    n //= 10
10                pairs += gcd(d, n) == 1
11        return pairs