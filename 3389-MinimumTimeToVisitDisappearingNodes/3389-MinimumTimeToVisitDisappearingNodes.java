// Last updated: 2/4/2026, 12:27:10 PM
class Solution {
    class Pair {
        int vtx ;
        int cost ;
        Pair(int vtx , int cost){
            this.vtx = vtx;
            this.cost =cost;
        }
    }
    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
        HashMap<Integer , HashMap<Integer,Integer>> map = new HashMap<>();
    
        for (int i = 0 ; i<n ;i++){
            map.put(i , new HashMap<>());
        }
        for (int[] tmp : edges){
            int a =tmp[0];
            int b =tmp[1];
            int cost = tmp[2];
            if (map.get(a).getOrDefault(b,0)==0) map.get(a).put(b,cost);
            else map.get(a).put(b,Math.min(cost,map.get(a).get(b)));

            if (map.get(b).getOrDefault(a,0)==0) map.get(b).put(a,cost);
            else map.get(b).put(a,Math.min(cost,map.get(b).get(a)));
        }
        HashSet<Integer>  visited = new HashSet<>();
        PriorityQueue<Pair> p = new PriorityQueue<>((a,b)-> Integer.compare(a.cost,b.cost));
        int[] ans = new int[n];
        p.add(new Pair(0 ,0));
        while(!p.isEmpty()){
            //remove
            Pair rv = p.poll();
            //Ignore
            if (visited.contains(rv.vtx)) continue ;
            //Mark Visited
            visited.add(rv.vtx);
            // self work 
            if(rv.cost < disappear[rv.vtx]){
                ans[rv.vtx] = rv.cost;
            }
            else {
                ans[rv.vtx] = -1;
                continue;
            }
            //add unvisited nbrs
            for (int x : map.get(rv.vtx).keySet()){
                if (!visited.contains(x))
                p.add(new Pair(x , rv.cost+map.get(rv.vtx).get(x)));
            }
        }
        for (int i=0 ; i<n ;i++){
            if ( !visited.contains(i)) ans[i] =-1;
        }
        return ans;

    }
}