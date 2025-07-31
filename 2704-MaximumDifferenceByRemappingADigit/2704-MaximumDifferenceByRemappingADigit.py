# Last updated: 7/31/2025, 12:28:06 PM
class Solution:
    def minMaxDifference(self, num: int) -> int:
        n=list(str(num))
        changed=None
        for i in range(len(n)):
            if changed==None and n[i]<'9':
                changed=n[i]
                n[i]='9'
            elif n[i]== changed:
                n[i]='9'
        n1= int("".join(n))
        changed=None
        n=list(str(num))
        for i in range(len(n)):
            if changed==None and n[i]<='9':
                changed=n[i]
                n[i]='0'
            elif n[i]== changed:
                n[i]='0'
        n2= int("".join(n))
        return n1-n2

            