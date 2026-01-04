# Last updated: 1/4/2026, 3:23:54 PM
1class Solution:
2    def maxRepeating(self, sequence: str, word: str) -> int:
3        ans =0
4        for i in range( 0 , len(sequence)//len(word) +1):
5            if ( word*i  in sequence):
6                ans =i
7            else:
8                break
9        return ans