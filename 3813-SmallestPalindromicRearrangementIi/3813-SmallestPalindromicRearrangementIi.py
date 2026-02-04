# Last updated: 2/4/2026, 12:26:33 PM
import math

class Solution:
    def smallestPalindrome(self, s: str, k: int) -> str:
        
        pos = lambda x: ord(x) - ord('a')   
        char = lambda x: chr(x + ord('a'))  
        mid = ""
        if len(s) % 2 == 1:
            mid = s[len(s)//2]  

        cnt = [0] * 26
        for ch in s:
            cnt[pos(ch)] += 1
        
      
        for i in range(26):
            cnt[i] //= 2

        out = []

     
        for i in range(len(s) // 2):
            for j in range(26):  
                if cnt[j] > 0:
                    cnt[j] -= 1

                   
                    ways = 1
                    total = sum(cnt)
                    for freq in cnt:
                        if freq > 0:
                            ways *= math.comb(total, freq)
                            total -= freq
                        if ways >= k:
                            break
                    
                    if ways >= k:
                        out.append(char(j))
                        break
                    else:
                        k -= ways
                        cnt[j] += 1
            else:
                return "" 

        out = "".join(out)
        return out + mid + out[::-1]  