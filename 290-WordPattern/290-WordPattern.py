# Last updated: 7/31/2025, 12:30:00 PM
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s=s.split()
        if len(pattern)!=len(s):
            return False
        d={}
        d2={}
        flag=True
        for i in range(len(pattern)):
            if pattern[i] not in d.keys():
                d[pattern[i]]=s[i]
            else:
                if d[pattern[i]]!=s[i]:
                    return False

        
        for i in range(len(pattern)):
            if s[i] not in d2.keys():
                d2[s[i]]=pattern[i]
            else:
                if d2[s[i]]!=pattern[i]:
                    return False
        return True

