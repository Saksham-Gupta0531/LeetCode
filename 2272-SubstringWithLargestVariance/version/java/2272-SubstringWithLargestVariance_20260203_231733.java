// Last updated: 2/3/2026, 11:17:33 PM
1class Solution {
2    public int largestVariance(String s) {
3        int n = s.length();
4        int maxVariance = 0;
5        
6        int[] freq = new int[26];
7        
8        for (int i=0; i<n; i++) {
9            freq[s.charAt(i) - 'a']++;
10        }
11        
12        for (int a=0; a<26; a++) {
13            for (int b=0; b<26; b++) {
14                if (a == b || freq[a] == 0 || freq[b] == 0) continue;
15
16                int[] nums = new int[n];
17                
18                for (int i=0; i<n; i++) {
19                    int c = s.charAt(i) - 'a';
20                    if (c == a) 
21                        nums[i] = 1;
22                    else if (c == b) 
23                        nums[i] = -1;
24                    
25                }
26                maxVariance = Math.max(maxVariance, findVariance(nums));
27            }
28        }
29        return maxVariance;
30    }
31    
32    private int findVariance(int[] nums) {
33        int n = nums.length;
34        
35        int[] dpForward = new int[n];
36        dpForward[0] = nums[0];
37        for (int i=1; i<n; i++) {
38            dpForward[i] = Math.max(dpForward[i-1]+nums[i], nums[i]);
39        }
40        
41        int curSum = 0;
42        int maxVariance = 0;
43        for (int i=n-1; i>=0; i--) {
44            curSum = Math.max(curSum+nums[i], nums[i]);
45            if (nums[i] == -1)
46                maxVariance = Math.max(maxVariance, dpForward[i] + curSum - nums[i]);
47        }
48
49        return maxVariance;
50    }
51}