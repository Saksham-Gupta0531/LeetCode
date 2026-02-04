# Last updated: 2/4/2026, 12:26:27 PM
class Solution:
    def generateTag(self, caption: str) -> str:
        
        a= caption.title().split()
        if not a:
            return "#"
        a=''.join('#' + a[0].lower() + ''.join(a[1:]))
        return a[:100]