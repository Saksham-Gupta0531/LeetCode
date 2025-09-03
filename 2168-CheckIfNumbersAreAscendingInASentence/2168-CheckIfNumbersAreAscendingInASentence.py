# Last updated: 9/3/2025, 5:27:40 PM
class Solution:
    def areNumbersAscending(self, s: str) -> bool:
        v=0
        i=0
        while i< len(s) :
            num=0
            if s[i]>='0' and s[i]<='9' :
                while (i< len(s) and s[i].isdigit()):
                    num = num*10+int(s[i])
                    i+=1
                
                if num<=v :
                    return False 
                v=num
            i+=1
        return True


            

        