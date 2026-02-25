// Last updated: 2/25/2026, 8:55:15 AM
1class Solution {
2    public int[] sortByBits(int[] arr) {
3        Integer[] boxed = new Integer[arr.length];
4        for (int i = 0; i < arr.length; i++) {
5           boxed[i] = arr[i]; 
6}
7        Arrays.sort(boxed,(a,b)->{
8            int x= count(Integer.toBinaryString(a));
9            int y=count (Integer.toBinaryString(b));
10            if (x==y)
11                return a-b;
12            else 
13                return x-y;
14            
15            });
16
17       int[] unboxed = new int[boxed.length];
18        for (int i = 0; i < boxed.length; i++) {
19            unboxed[i] = boxed[i];
20        }
21        return unboxed;
22    }
23    public int count(String s){
24        int c=0;
25        System.out.print(s+" ");
26        for (int i = 0 ; i <s.length() ;i++)
27            if ( s.charAt(i)=='1') c++;
28        return c;
29    }
30}