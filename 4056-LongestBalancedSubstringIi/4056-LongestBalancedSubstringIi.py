# Last updated: 2/4/2026, 12:25:48 PM
class Solution:
    def longestBalanced(self, s):
        n, max_val = len(s), 0

        count_a, count_b, count_c = 0, 0, 0 

        for i in range(n):
            if s[i] == "a":
                count_a += 1 
                count_b = 0 
                count_c = 0 
                max_val = max(max_val,count_a)
            if s[i] == "b":
                count_b += 1 
                count_a = 0 
                count_c = 0 
                max_val = max(max_val,count_b)
            if s[i] == "c":
                count_c += 1 
                count_a = 0 
                count_b = 0 
                max_val = max(max_val,count_c)

        dict1 = defaultdict(int)

        count_a, count_b, count_c = 0, 0, 0 

        for i in range(n):
            if s[i] == "a":
                count_a += 1 
            
            if s[i] == "b":
                count_b += 1 

            if s[i] == "c":
                count_a = 0 
                count_b = 0 
                dict1 = defaultdict(int)

            if count_a == count_b:
                max_val = max(max_val,2*count_a)

            if count_a-count_b in dict1:
                max_val = max(max_val,i-dict1[count_a-count_b])

            if count_a-count_b not in dict1:
                dict1[count_a-count_b] = i 

        dict1 = defaultdict(int)

        count_a, count_b, count_c = 0, 0, 0 

        for i in range(n):
            if s[i] == "a":
                count_b = 0 
                count_c = 0 
                dict1 = defaultdict(int)
            
            if s[i] == "b":
                count_b += 1

            if s[i] == "c":
                count_c += 1 

            if count_b == count_c:
                max_val = max(max_val,2*count_b)

            if count_b-count_c in dict1:
                max_val = max(max_val,i-dict1[count_b-count_c])

            if count_b-count_c not in dict1:
                dict1[count_b-count_c] = i 

        dict1 = defaultdict(int)

        count_a, count_b, count_c = 0, 0, 0 

        for i in range(n):
            if s[i] == "a":
                count_a += 1 
            
            if s[i] == "b":
                count_a = 0 
                count_c = 0 
                dict1 = defaultdict(int)

            if s[i] == "c":
                count_c += 1 

            if count_a == count_c:
                max_val = max(max_val,2*count_a)

            if count_a-count_c in dict1:
                max_val = max(max_val,i-dict1[count_a-count_c])

            if count_a-count_c not in dict1:
                dict1[count_a-count_c] = i 

        dict1 = defaultdict(int)

        count_a, count_b, count_c = 0, 0, 0 

        for i in range(n):
            if s[i] == "a":
                count_a += 1 
            
            if s[i] == "b":
                count_b += 1 

            if s[i] == "c":
                count_c += 1 

            if count_a == count_b and count_b == count_c:
                max_val = max(max_val,3*count_a)

            if (count_a-count_b,count_b-count_c) in dict1:
                max_val = max(max_val,i-dict1[(count_a-count_b,count_b-count_c)])

            if (count_a-count_b,count_b-count_c) not in dict1:
                dict1[(count_a-count_b,count_b-count_c)] = i 

        return max_val 