# Last updated: 12/26/2025, 7:30:48 PM
1class Solution:
2    def countBinaryPalindromes(self, n: int) -> int:
3        if n == 0: return 1
4        res = 1
5        lst = [int(i) for i in bin(n)[2:]]
6        n = len(lst)
7        for k in range(1, n):
8            res += 1 << ((k + 1) // 2 - 1)
9        half = (n + 1) // 2
10        for i in range(1, half):
11            if lst[i] == 1:
12                res += 1 << (half - i - 1)
13        res += lst[:half][::-1] <= lst[-half:]
14        return res
15        