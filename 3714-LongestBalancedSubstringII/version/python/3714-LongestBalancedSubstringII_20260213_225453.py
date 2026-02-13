# Last updated: 2/13/2026, 10:54:53 PM
1class Solution:
2    def longestBalanced(self, s):
3        n, max_val = len(s), 0
4
5        count_a, count_b, count_c = 0, 0, 0 
6
7        for i in range(n):
8            if s[i] == "a":
9                count_a += 1 
10                count_b = 0 
11                count_c = 0 
12                max_val = max(max_val,count_a)
13            if s[i] == "b":
14                count_b += 1 
15                count_a = 0 
16                count_c = 0 
17                max_val = max(max_val,count_b)
18            if s[i] == "c":
19                count_c += 1 
20                count_a = 0 
21                count_b = 0 
22                max_val = max(max_val,count_c)
23
24        dict1 = defaultdict(int)
25
26        count_a, count_b, count_c = 0, 0, 0 
27
28        for i in range(n):
29            if s[i] == "a":
30                count_a += 1 
31            
32            if s[i] == "b":
33                count_b += 1 
34
35            if s[i] == "c":
36                count_a = 0 
37                count_b = 0 
38                dict1 = defaultdict(int)
39
40            if count_a == count_b:
41                max_val = max(max_val,2*count_a)
42
43            if count_a-count_b in dict1:
44                max_val = max(max_val,i-dict1[count_a-count_b])
45
46            if count_a-count_b not in dict1:
47                dict1[count_a-count_b] = i 
48
49        dict1 = defaultdict(int)
50
51        count_a, count_b, count_c = 0, 0, 0 
52
53        for i in range(n):
54            if s[i] == "a":
55                count_b = 0 
56                count_c = 0 
57                dict1 = defaultdict(int)
58            
59            if s[i] == "b":
60                count_b += 1
61
62            if s[i] == "c":
63                count_c += 1 
64
65            if count_b == count_c:
66                max_val = max(max_val,2*count_b)
67
68            if count_b-count_c in dict1:
69                max_val = max(max_val,i-dict1[count_b-count_c])
70
71            if count_b-count_c not in dict1:
72                dict1[count_b-count_c] = i 
73
74        dict1 = defaultdict(int)
75
76        count_a, count_b, count_c = 0, 0, 0 
77
78        for i in range(n):
79            if s[i] == "a":
80                count_a += 1 
81            
82            if s[i] == "b":
83                count_a = 0 
84                count_c = 0 
85                dict1 = defaultdict(int)
86
87            if s[i] == "c":
88                count_c += 1 
89
90            if count_a == count_c:
91                max_val = max(max_val,2*count_a)
92
93            if count_a-count_c in dict1:
94                max_val = max(max_val,i-dict1[count_a-count_c])
95
96            if count_a-count_c not in dict1:
97                dict1[count_a-count_c] = i 
98
99        dict1 = defaultdict(int)
100
101        count_a, count_b, count_c = 0, 0, 0 
102
103        for i in range(n):
104            if s[i] == "a":
105                count_a += 1 
106            
107            if s[i] == "b":
108                count_b += 1 
109
110            if s[i] == "c":
111                count_c += 1 
112
113            if count_a == count_b and count_b == count_c:
114                max_val = max(max_val,3*count_a)
115
116            if (count_a-count_b,count_b-count_c) in dict1:
117                max_val = max(max_val,i-dict1[(count_a-count_b,count_b-count_c)])
118
119            if (count_a-count_b,count_b-count_c) not in dict1:
120                dict1[(count_a-count_b,count_b-count_c)] = i 
121
122        return max_val 