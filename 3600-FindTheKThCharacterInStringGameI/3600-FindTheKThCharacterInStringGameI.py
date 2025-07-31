# Last updated: 7/31/2025, 12:27:53 PM
class Solution:
    def kthCharacter(self, k: int) -> str:
        s="a"

        while(len(s)<k) :
            for i in range(len(s)):
                if s[i]=='z':
                    s=s+'a'
                else:
                    s= s+chr(ord(s[i])+1)
        return s[k-1]