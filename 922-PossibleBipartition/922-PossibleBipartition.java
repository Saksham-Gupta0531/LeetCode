// Last updated: 2/4/2026, 12:30:33 PM
class Solution {
    class Pair{
        int vtx ;
        int dis ;
        Pair(int vtx , int dis){
            this.vtx = vtx ;
            this.dis = dis ;
        }
    }
    public boolean possibleBipartition(int n, int[][] dislikes) {
        HashMap<Integer , HashSet<Integer>>  map = new HashMap<>();
        for (int i = 1 ; i<= n ; i++){
            map.put(i , new HashSet<>());
        }
        for(int[] arr : dislikes){
            int a = arr[0];
            int b = arr[1];
            map.get(a).add(b);
            map.get(b).add(a);
        }
        Queue<Pair> q= new LinkedList<>();
        HashMap<Integer ,Integer> visited= new HashMap<>();
        
        for (int i = 1 ; i <= n ; i++){
            if (visited.containsKey(i)){
                continue;    
            }    
            q.add(new Pair(i,0));
            while ( !q.isEmpty()){
                //remove
                Pair rv = q.poll();
                //ignore
                if (visited.containsKey(rv.vtx)){
                    if ( rv.dis != visited.get(rv.vtx) )return false;
                    continue;
                }
                //mark visited 
                visited.put(rv.vtx,rv.dis);
                //add unvisited nbrs 
                for ( int nbrs : map.get(rv.vtx)){
                    if (!visited.containsKey(nbrs))
                        q.add(new Pair( nbrs , rv.dis +1));
                }

            }
        }
        return true ;

    }
}