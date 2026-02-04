# Last updated: 2/4/2026, 12:27:29 PM
class Solution:
    def countBeautifulPairs(self, nums: List[int]) -> int:
        pairs = 0
        for i, num in enumerate(nums):
            d = num % 10
            for j in range(i):
                n = nums[j]
                while n >= 10:
                    n //= 10
                pairs += gcd(d, n) == 1
        return pairs