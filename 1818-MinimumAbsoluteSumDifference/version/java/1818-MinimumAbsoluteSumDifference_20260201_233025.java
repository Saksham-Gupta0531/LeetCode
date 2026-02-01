// Last updated: 2/1/2026, 11:30:25 PM
1class Solution {
2    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
3         int arr[]=new int[nums1.length];
4        long result=0;
5        for(int i=0;i<nums1.length;i++)
6        {
7            arr[i]=nums1[i];
8            result+=Math.abs(nums1[i]-nums2[i]);
9
10        }
11        if(result==0)
12        {
13            return (int)(result%(1000000007));
14        }
15        long min=result;
16        Arrays.sort(nums1);
17        for(int i=0;i<nums2.length;i++)
18        {
19            int low=0,high=nums1.length-1;
20            while(low<=high)
21            {
22                int mid=(low+high)/2;
23                if(nums1[mid]>nums2[i])
24                {
25                    high=mid-1;
26                }
27                else if(nums1[mid]==nums2[i])
28                {
29                     low=mid;
30                     break;
31                }
32                else
33                {
34                    low=mid+1;
35                }
36            }
37           
38            if(low==arr.length)
39            {
40              long ans=result-Math.abs(arr[i]-nums2[i])+Math.abs(nums1[low-1]-nums2[i]);
41               if(ans<min)
42               {
43                 min=ans;
44               }
45            }
46            else if(low==0)
47            {
48              long ans=result-Math.abs(arr[i]-nums2[i])+Math.abs(nums1[low]-nums2[i]);
49               if(ans<min)
50               {
51                 min=ans;
52               }
53            }
54            else
55            {
56                 long ans=result-Math.abs(arr[i]-nums2[i])+Math.abs(nums1[low]-nums2[i]);
57               if(ans<min)
58               {
59                 min=ans;
60               }
61               
62                ans=result-Math.abs(arr[i]-nums2[i])+Math.abs(nums1[low-1]-nums2[i]);
63                if(ans<min)
64                {
65                    min=ans;
66                }
67               
68            }
69 
70        }
71  return (int)(min%(1000000007));
72    }
73}