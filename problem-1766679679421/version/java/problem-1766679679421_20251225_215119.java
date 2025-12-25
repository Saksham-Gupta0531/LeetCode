// Last updated: 12/25/2025, 9:51:19 PM
1class Solution {
2    public int[] countRectangles(int[][] rectangles, int[][] points) {
3        List<Integer>[] arr = new ArrayList[101];
4        for (int i = 0; i < arr.length; i++)
5            arr[i] = new ArrayList<Integer>();
6        for (int[] rec : rectangles)
7            arr[rec[1]].add(rec[0]);
8        for (int i = arr.length - 1; i >= 0; i--) {
9            if (i != arr.length - 1)
10                arr[i].addAll(arr[i + 1]);
11            Collections.sort(arr[i]);
12        }
13        // System.out.println(Arrays.deepToString(arr));
14        int[] res = new int[points.length];
15        for (int i = 0; i < points.length; i++) {
16            int idx = bSearch(arr[points[i][1]], points[i][0]);
17            res[i] = arr[points[i][1]].size() - idx;
18            
19        //System.out.println(Arrays.toString(points[i]) + "|" + arr[points[i][1]] + "|" + idx + "|" + res[i] + "%");
20        }
21        return res;
22    }
23
24    int bSearch(List<Integer> list, int n) {
25        int l = 0, r = list.size();
26        while (l < r) {
27            int mid = l + (r - l) / 2;
28            if (n > list.get(mid))
29                l = mid + 1;
30            else
31                r = mid;
32        }
33        return l;
34    }
35}