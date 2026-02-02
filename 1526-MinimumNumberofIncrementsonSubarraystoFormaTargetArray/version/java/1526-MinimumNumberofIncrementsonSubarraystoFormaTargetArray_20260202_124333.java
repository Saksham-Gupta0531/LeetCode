// Last updated: 2/2/2026, 12:43:33 PM
1class Solution {
2    public int minNumberOperations(int[] arr) {
3        boolean flag = false;//false increaseing
4        int g_min = Integer.MAX_VALUE;
5        ArrayList<Integer> set = new ArrayList<>();
6        ArrayList<Integer> set2 = new ArrayList<>();
7        int p = 0;
8        for (int i = 0; i < arr.length; i++) {
9            if (p <= arr[i]) {
10                if(flag ){
11                    set2.add(p);
12                }
13                p = arr[i];
14                flag = false;
15            } else if (p > arr[i] ) {
16                if( !flag)
17                    set.add(p);
18
19                flag = true;
20                p = arr[i];
21            }
22            //System.out.println(i+" "+p+" "+flag+"    "+set2);
23
24        }
25        if (!flag)
26            set.add(p);
27        // System.out.println(set);
28        // System.out.println(set2);
29        int sum = 0;
30        int sum2 =0;
31        for (int x : set) 
32            sum += x;
33        for (int x : set2) 
34            sum2 += x;
35        
36        return sum - sum2;
37    }
38}