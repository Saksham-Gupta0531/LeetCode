# Last updated: 9/4/2025, 6:14:47 AM
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        x= prices[0]
        ans=0
        for i in range(1, len(prices)):
            if (x>prices[i]):
                x= prices[i]
            else :
                if (prices[i]-x)> ans:
                    ans = prices[i]-x
        return ans
        