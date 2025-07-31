# Last updated: 7/31/2025, 12:28:40 PM
from typing import List

class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        l = list(words[0])
        for word in words[1:]:
            new_list = []
            for char in l:
                if char in word:
                    new_list.append(char)
                    word = word.replace(char, '', 1)
            l = new_list
        return l
