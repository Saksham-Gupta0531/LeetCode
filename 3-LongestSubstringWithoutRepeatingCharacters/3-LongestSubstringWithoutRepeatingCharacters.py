# Last updated: 9/4/2025, 6:16:11 AM
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        var=s[0] if s != '' else ''
        for i in range(len(s)):
            temp = s[i]
            for j in range(i+1, len(s)):
                if s[j] not in temp:
                    temp += s[j]
                    if len(temp) > len(var):
                        var = temp
                else:
                    break
        return len(var)
