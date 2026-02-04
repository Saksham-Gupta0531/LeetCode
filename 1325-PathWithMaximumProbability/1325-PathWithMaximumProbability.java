// Last updated: 2/4/2026, 12:29:56 PM
class Solution {
    class Pair{
        int vtx;
        double cost;
        Pair(int vtx ,double cost){
            this.vtx=vtx;
            this.cost=cost;
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        HashMap<Integer,HashMap<Integer,Double>> map = new HashMap<>();
        for (int i = 0 ; i<=n ;i++){
            map.put(i,new HashMap<>());
        }
        for(int i = 0 ; i <edges.length ;i++){
            map.get(edges[i][0]).put(edges[i][1],succProb[i]);
            map.get(edges[i][1]).put(edges[i][0],succProb[i]);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Double.compare(b.cost ,a.cost));
        pq.add(new Pair (start_node,1));
        HashSet<Integer> visited = new HashSet<>();
        while(!pq.isEmpty()){
            //remove
            Pair node = pq.poll();
            //ignore
            if (visited.contains(node.vtx)) continue;
            //mark visited
            visited.add(node.vtx);
            //self work
            if (node.vtx == end_node) return node.cost;
            //add unvisited nbrs
            for (int x : map.get(node.vtx).keySet()){
                if (!visited.contains(x)){
                    double c = map.get(node.vtx).get(x);
                    pq.add(new Pair(x, node.cost*c ));
                }
            }
        }
        return 0;
    }
}