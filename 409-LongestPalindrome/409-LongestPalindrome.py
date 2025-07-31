# Last updated: 7/31/2025, 12:29:36 PM
class Solution:
    def longestPalindrome(self, s: str) -> int:
        freq = {}
        for char in s:
            freq[char] = freq.get(char, 0) + 1
        length = 0
        odd_found = False
        for count in freq.values():
            if count % 2 == 0:
                length += count
            else:
                length += count - 1
                odd_found = True
        return length + 1 if odd_found else length
