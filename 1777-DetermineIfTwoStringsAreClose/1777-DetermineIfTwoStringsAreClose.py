# Last updated: 2/4/2026, 12:29:14 PM
class Solution:
    def closeStrings(self, w1: str, w2: str) -> bool:
        return Counter(Counter(w1).values()) == Counter(Counter(w2).values()) \
               and set(w1) == set(w2)