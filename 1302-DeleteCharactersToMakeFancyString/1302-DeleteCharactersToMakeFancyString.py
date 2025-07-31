# Last updated: 7/31/2025, 12:28:41 PM
class Solution:
    def makeFancyString(self, s: str) -> str:
        ns=s[0]
        count=0
        for i in range(1,len(s)):
            if count>=1:
                if s[i]==s[i-1]:
                    continue
                else:
                    count=0
            if count<1:
                ns=ns+s[i]
                if s[i]==s[i-1]:
                    count+=1
                else:
                    count=0
                
        return ns   
        