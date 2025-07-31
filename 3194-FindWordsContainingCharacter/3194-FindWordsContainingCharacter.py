# Last updated: 7/31/2025, 12:28:08 PM
class Solution(object):
    def findWordsContaining(self, words, x):
        """
        :type words: List[str]
        :type x: str
        :rtype: List[int]
        """
        res = []
        for i in range(len(words)):
            a = words[i]
            if x in a:
                res.append(i)
        return res
