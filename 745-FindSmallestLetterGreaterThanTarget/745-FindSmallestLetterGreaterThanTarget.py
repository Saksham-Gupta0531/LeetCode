# Last updated: 7/31/2025, 12:29:14 PM
class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        temp=letters[0]
        for ch in letters:
            if ch>target:
                return ch
        else:
            return letters[0]
