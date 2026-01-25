// Last updated: 1/25/2026, 11:11:09 PM
1class Solution {
2    public long minimalKSum(int[] nums, int k) {
3        TreeSet<Integer> set = new TreeSet<Integer>();
4        for (int n : nums)                               
5            set.add(n);
6        long sum = ((long)(k + 1) * (long)k) / 2;     
7        int count = 0;                                
8        for (Integer i : set) {
9            if (i > k)                      
10                break;
11            else {
12                sum -= i;                              
13                count++;                              
14            }                                          
15        }
16        int i = k + 1;                              
17        while (count > 0) {
18            if (!set.contains(i)) {
19                sum += i;
20                count--;
21            }
22            i++;
23        }
24        return sum;
25    }
26}