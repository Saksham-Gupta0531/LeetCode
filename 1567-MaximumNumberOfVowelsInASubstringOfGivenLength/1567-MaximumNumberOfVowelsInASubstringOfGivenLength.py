# Last updated: 9/8/2025, 11:48:56 PM
class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        vowels = {'a', 'e', 'i', 'o', 'u'}
        
        count = sum(1 for i in s[:k] if i in vowels)
        max_count = count
        
        for i in range(k, len(s)):
            if s[i] in vowels:
                count += 1
            if s[i - k] in vowels:
                count -= 1
            max_count = max(max_count, count)
            
            if max_count == k:
                return k
        
        return max_count
