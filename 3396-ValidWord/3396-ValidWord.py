# Last updated: 7/31/2025, 12:27:57 PM
class Solution:
    def isValid(self, word: str) -> bool:
        if(len(word)<3):
            return False
        vowels=set("aeiouAEIOU")
        c=0
        v=0
        for ch in word:
            if ch.isdigit():
                continue
            if ch.isalpha():
                (v := v + 1) if ch in vowels else (c := c + 1)
            else:
                return False
        return v > 0 and c > 0
                
