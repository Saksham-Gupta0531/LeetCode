# Last updated: 7/31/2025, 12:29:33 PM
class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        l=[]
        for i in range(1,n+1):
            s=""
            if i%3==0 or i%5==0:
                if i%3==0:
                    s=s+"Fizz"
                
                if i%5==0:
                    s=s+"Buzz"
            else:
                s=str(i)
            l.append(s)
        return l
            