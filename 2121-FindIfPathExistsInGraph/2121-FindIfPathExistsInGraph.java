// Last updated: 2/4/2026, 12:28:37 PM
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int i = 0 ; i <= n ;i++){
            map.put(i,new HashSet<>());
        }
        for (int i = 0 ; i  < edges.length ; i++ ){
            map.get(edges[i][0]).add(edges[i][1]);
            map.get(edges[i][1]).add(edges[i][0]);
        }

        Queue<Integer> que = new LinkedList<>();
        
        que.add(source);
        HashSet<Integer> visited = new HashSet<>();
        while(!que.isEmpty()){
            //remove
            int rv = que.poll();
            if(rv== destination) return true;
            //ignore
            if (visited.contains(rv))continue;
            //mark visit
            visited.add(rv);
            
            for(int x: map.get(rv)){
                que.add(x);
            }
                }
    return false;
    }
}