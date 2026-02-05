// Last updated: 2/5/2026, 8:37:14 PM
1class Solution {
2    private int find(ArrayList<Integer> al, int x)
3    {
4
5        if(al.size()<x)
6        return 0;
7        return al.get(x-1);
8     
9    }
10    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
11        int a[] = new int[nums.length-k+1];
12        int  l =0;
13        int r =0;
14        int p = 0;
15        ArrayList<Integer> al  =new ArrayList<>();
16        while(r<nums.length)
17        {
18            if(nums[r]<0)
19            {
20                int pos = Collections.binarySearch(al, nums[r]);
21                if (pos < 0) pos = -(pos + 1);
22                al.add(pos, nums[r]); 
23            }
24            if(r-l+1==k)
25            {
26                a[p++] = find(al,x);
27                if (nums[l] < 0) {
28                    int pos = Collections.binarySearch(al, nums[l]);
29                    al.remove(pos);
30                }
31                l++;
32            }
33            r++;
34        }
35        return a;
36    }
37}