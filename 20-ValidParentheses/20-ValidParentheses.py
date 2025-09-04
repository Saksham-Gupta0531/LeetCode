# Last updated: 9/4/2025, 6:15:54 AM
class Solution:
    def isValid(self, s: str) -> bool:
        l=[]
        for i in range(len(s)):
            if s[i]=="(" or s[i]=="[" or s[i]=="{":
                l.append(s[i])
            elif s[i]==")":
                if l != [] and l[-1]=="(":
                    l.pop()
                else:
                    return False
            elif s[i]=="]":
                if l != [] and l[-1]=="[":
                    l.pop()
                else:
                    return False
            elif s[i]=="}":
                if l != [] and l[-1]=="{":
                    l.pop()
                else:
                    return False
        if l != []:
            return False
        return True