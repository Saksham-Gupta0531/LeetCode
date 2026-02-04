# Last updated: 2/4/2026, 12:29:17 PM
class Solution:
    def maxRepeating(self, sequence: str, word: str) -> int:
        ans =0
        for i in range( 0 , len(sequence)//len(word) +1):
            if ( word*i  in sequence):
                ans =i
            else:
                break
        return ans