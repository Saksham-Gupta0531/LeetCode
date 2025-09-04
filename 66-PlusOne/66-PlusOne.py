# Last updated: 9/4/2025, 6:15:21 AM
class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        var = 0
        for num in digits:
            var=var*10
            var=var+num
        var+=1
        var=str(var)
        try1=[]
        for i in range(len(var)):
            try1.append(eval(var[i]))
        return try1