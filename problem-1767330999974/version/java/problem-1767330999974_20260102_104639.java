// Last updated: 1/2/2026, 10:46:39 AM
1class Solution {
2    class Pair {
3        int vrtx ;
4        Long score ;
5        Pair(int vrtx, Long score){
6            this.vrtx = vrtx ;
7            this.score =score;
8        }
9    }
10    public int edgeScore(int[] edges) {
11        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
12        int n= edges.length;
13        for ( int i=0; i<n ;i++){
14            map.put(i,new HashSet<>());
15        }
16        for (int i = 0 ; i<n ;i++){
17            map.get(edges[i]).add(i);
18        }
19        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
20            if(a.score != b.score) 
21            return Long.compare(b.score , a.score);
22            return Integer.compare(a.vrtx ,b.vrtx);
23        });
24
25        //HashSet<Integer> visited = new HashSet<>();
26        for (int i = 0; i< n ;i++){
27            pq.add(new Pair(i ,sum(map.get(i))));
28        }
29        return pq.poll().vrtx;
30        
31    }
32    public long sum(HashSet<Integer> set){
33        long sum = 0 ;
34        for (int x: set){
35            sum+=x;
36        }
37        return sum;
38    }
39}