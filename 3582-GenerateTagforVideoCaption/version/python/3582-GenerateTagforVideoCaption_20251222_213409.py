# Last updated: 12/22/2025, 9:34:09 PM
1class Solution:
2    def generateTag(self, caption: str) -> str:
3        
4        a= caption.title().split()
5        if not a:
6            return "#"
7        a=''.join('#' + a[0].lower() + ''.join(a[1:]))
8        return a[:100]