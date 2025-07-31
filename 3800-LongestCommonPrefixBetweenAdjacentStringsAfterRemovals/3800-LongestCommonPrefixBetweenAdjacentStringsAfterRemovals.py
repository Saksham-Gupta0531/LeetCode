# Last updated: 7/31/2025, 12:27:47 PM
from typing import List

class Solution:
    @staticmethod
    def lcp(a, b):
        i = 0
        while i < min(len(a), len(b)) and a[i] == b[i]:
            i += 1
        return i

    def longestCommonPrefix(self, words: List[str]) -> List[int]:
        n = len(words)
        if n == 1:
            return [0]

        lcp_list = [self.lcp(words[i], words[i + 1]) for i in range(n - 1)]

        prefix = [0] * (n - 1)
        suffix = [0] * (n - 1)

        prefix[0] = lcp_list[0]
        for i in range(1, n - 1):
            prefix[i] = max(prefix[i - 1], lcp_list[i])

        suffix[-1] = lcp_list[-1]
        for i in range(n - 3, -1, -1):
            suffix[i] = max(suffix[i + 1], lcp_list[i])

        res = []
        for i in range(n):
            m = 0
            if 0 < i < n - 1:
                m = self.lcp(words[i - 1], words[i + 1])
                if i > 1:
                    m = max(m, prefix[i - 2])
                if i + 1 < n - 1:
                    m = max(m, suffix[i + 1])
            elif i == 0:
                if n > 2:
                    m = suffix[1]
                elif n == 2:
                    m = 0  # no adjacent pairs remain
            else:  # i == n - 1
                if n > 2:
                    m = prefix[n - 3]
                elif n == 2:
                    m = 0 
            res.append(m)

        return res
