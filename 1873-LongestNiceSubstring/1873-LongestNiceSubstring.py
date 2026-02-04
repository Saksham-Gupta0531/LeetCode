# Last updated: 2/4/2026, 12:29:08 PM
class Solution:
    def longestNiceSubstring(self, s: str) -> str:
        n = len(s)
        ans = ""

        for i in range(n):
            for j in range(i + 1, n + 1):
                sub = s[i:j]
                if self.check(sub):
                    if len(sub) > len(ans):
                        ans = sub

        return ans

    def check(self, s: str) -> bool:
        lower = [0] * 26
        upper = [0] * 26

        for ch in s:
            if 'a' <= ch <= 'z':
                lower[ord(ch) - ord('a')] = 1
            elif 'A' <= ch <= 'Z':
                upper[ord(ch) - ord('A')] = 1

        for i in range(26):
            if lower[i] != upper[i]:
                return False

        return True
