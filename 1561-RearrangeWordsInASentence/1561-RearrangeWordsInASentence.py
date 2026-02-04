# Last updated: 2/4/2026, 12:29:30 PM
class Solution:
    def arrangeWords(self, text: str) -> str:
        arr=text.split()
        arr[0]=arr[0].lower()
        n = len(arr)
        # for i in range(n):
        #     for j in range(0, n - i - 1):
        #         if len(arr[j]) > len(arr[j + 1]):
                   
        #             arr[j], arr[j + 1] = arr[j + 1], arr[j]
        arr.sort(key=len)
        arr[0] =arr[0].capitalize()
        return " ".join(arr)
        