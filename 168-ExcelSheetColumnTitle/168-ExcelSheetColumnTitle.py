# Last updated: 9/4/2025, 6:14:32 AM
class Solution:
    def convertToTitle(self,n: int) -> str:
        s=""
        
        while (n>0):
            n=n-1
            s=chr(n%26 + ord("A"))+s
            n=n//26
        return s
        

        