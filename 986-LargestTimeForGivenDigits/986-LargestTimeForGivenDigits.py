# Last updated: 2/4/2026, 12:30:20 PM
class Solution:
    def largestTimeFromDigits(self, arr):
        out = ""
        for P in permutations(arr):
            if P[0]*10 + P[1] <= 23 and P[2] <= 5:
                out = max(out, str(P[0])+str(P[1]) + ":" + str(P[2])+str(P[3]))
        
        return out