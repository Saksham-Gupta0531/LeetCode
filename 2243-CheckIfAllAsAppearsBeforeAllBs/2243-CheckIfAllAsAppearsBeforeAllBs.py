# Last updated: 9/3/2025, 5:27:35 PM
class Solution:
    def checkString(self, s: str) -> bool:
        ch="a"
        flag = 0
        for i in s:
            if i!=ch and flag == 0:
                ch='b'
                flag=1
            elif i==ch:
                continue
            else:
                return False
        return True
        

        
            