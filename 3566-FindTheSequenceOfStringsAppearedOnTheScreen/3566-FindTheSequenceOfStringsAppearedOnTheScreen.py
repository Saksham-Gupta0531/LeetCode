# Last updated: 7/31/2025, 12:27:54 PM
class Solution:
    def stringSequence(self, target: str) -> List[str]:
        x=target
        s=""
        lst=[]
        for i in range(len(x)):
            
            while True:
                if len(s) <= i:
                    s = s + "a"
                lst.append(s)
                
                if s[i] == x[i]:
                    break
                
                p = ord(s[i])
                p = p + 1
                s = s[:i] + chr(p) + s[i+1:]
                
               
        return lst
                    
        