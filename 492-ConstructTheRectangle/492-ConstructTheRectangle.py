# Last updated: 7/31/2025, 12:29:25 PM
class Solution:
    def constructRectangle(self, area: int) -> List[int]:
        b=int(area**(1/2))
        while(area%b!=0):
            b-=1
        l=int(area/b)
        if(b==1):
            return [area,1]

        return[l,b]
        