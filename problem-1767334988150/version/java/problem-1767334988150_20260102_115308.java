// Last updated: 1/2/2026, 11:53:08 AM
1class Solution {
2    class Pair {
3        int vtx ;
4        int cost ;
5        Pair(int vtx , int cost){
6            this.vtx = vtx;
7            this.cost =cost;
8        }
9    }
10    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
11        HashMap<Integer , HashMap<Integer,Integer>> map = new HashMap<>();
12    
13        for (int i = 0 ; i<n ;i++){
14            map.put(i , new HashMap<>());
15        }
16        for (int[] tmp : edges){
17            int a =tmp[0];
18            int b =tmp[1];
19            int cost = tmp[2];
20            if (map.get(a).getOrDefault(b,0)==0) map.get(a).put(b,cost);
21            else map.get(a).put(b,Math.min(cost,map.get(a).get(b)));
22
23            if (map.get(b).getOrDefault(a,0)==0) map.get(b).put(a,cost);
24            else map.get(b).put(a,Math.min(cost,map.get(b).get(a)));
25        }
26        HashSet<Integer>  visited = new HashSet<>();
27        PriorityQueue<Pair> p = new PriorityQueue<>((a,b)-> Integer.compare(a.cost,b.cost));
28        int[] ans = new int[n];
29        p.add(new Pair(0 ,0));
30        while(!p.isEmpty()){
31            //remove
32            Pair rv = p.poll();
33            //Ignore
34            if (visited.contains(rv.vtx)) continue ;
35            //Mark Visited
36            visited.add(rv.vtx);
37            // self work 
38            if(rv.cost < disappear[rv.vtx]){
39                ans[rv.vtx] = rv.cost;
40            }
41            else {
42                ans[rv.vtx] = -1;
43                continue;
44            }
45            //add unvisited nbrs
46            for (int x : map.get(rv.vtx).keySet()){
47                if (!visited.contains(x))
48                p.add(new Pair(x , rv.cost+map.get(rv.vtx).get(x)));
49            }
50        }
51        for (int i=0 ; i<n ;i++){
52            if ( !visited.contains(i)) ans[i] =-1;
53        }
54        return ans;
55
56    }
57}