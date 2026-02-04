# Last updated: 2/4/2026, 12:26:05 PM
class Solution:
    def countBinaryPalindromes(self, n: int) -> int:
        if n == 0: return 1
        res = 1
        lst = [int(i) for i in bin(n)[2:]]
        n = len(lst)
        for k in range(1, n):
            res += 1 << ((k + 1) // 2 - 1)
        half = (n + 1) // 2
        for i in range(1, half):
            if lst[i] == 1:
                res += 1 << (half - i - 1)
        res += lst[:half][::-1] <= lst[-half:]
        return res
        