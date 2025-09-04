# Last updated: 9/4/2025, 6:15:14 AM
class Solution:
    def addBinary(self, a: str, b: str) -> str:
        a=int(a)
        j=0
        k=0
        while a!=0:
            x=a%10
            a=a//10
            k=k+x*(2**j)
            j=j+1
        
        a=int(b)
        j=0
        m=0
        while a!=0:
            x=a%10
            a=a//10
            m=m+x*(2**j)
            j=j+1
        c=m+k
        return bin(c)[2:]