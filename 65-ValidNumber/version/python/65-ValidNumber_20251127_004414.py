# Last updated: 11/27/2025, 12:44:14 AM
1import re
2
3class Solution:
4    def isNumber(self, s: str) -> bool:
5        engine = re.compile(r"^[+-]?((\d+\.?\d*)|(\d*\.?\d+))([eE][+-]?\d+)?$")
6        return bool(engine.match(s.strip()))
7