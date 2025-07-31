# Last updated: 7/31/2025, 12:29:31 PM
class Solution:
    def addStrings(self, num1: str, num2: str) -> str:
        n1=n2=0
        s=''
        for i in num1:
            n1=n1*10+int(i)
        for i in num2:
             n2=n2*10+int(i)
        k=n1+n2
        if k==0:
            return "0"
        while k !=0:
            n=k%10
            s=s+str(n)
            k=k//10

        return s[::-1]

