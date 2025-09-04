# Last updated: 9/4/2025, 6:15:34 AM
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]: 
        dic={}
      
        for i in strs:
            if "".join(sorted(i)) in dic:
                dic["".join(sorted(i))]=dic["".join(sorted(i))]+[i]
            else:
                dic["".join(sorted(i))]=[i] 
        return list( dic.values())
        

            
        