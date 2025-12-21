# Last updated: 12/21/2025, 11:18:43 PM
1import math
2
3class Solution:
4    def smallestPalindrome(self, s: str, k: int) -> str:
5        
6        pos = lambda x: ord(x) - ord('a')   
7        char = lambda x: chr(x + ord('a'))  
8        mid = ""
9        if len(s) % 2 == 1:
10            mid = s[len(s)//2]  
11
12        cnt = [0] * 26
13        for ch in s:
14            cnt[pos(ch)] += 1
15        
16      
17        for i in range(26):
18            cnt[i] //= 2
19
20        out = []
21
22     
23        for i in range(len(s) // 2):
24            for j in range(26):  
25                if cnt[j] > 0:
26                    cnt[j] -= 1
27
28                   
29                    ways = 1
30                    total = sum(cnt)
31                    for freq in cnt:
32                        if freq > 0:
33                            ways *= math.comb(total, freq)
34                            total -= freq
35                        if ways >= k:
36                            break
37                    
38                    if ways >= k:
39                        out.append(char(j))
40                        break
41                    else:
42                        k -= ways
43                        cnt[j] += 1
44            else:
45                return "" 
46
47        out = "".join(out)
48        return out + mid + out[::-1]  