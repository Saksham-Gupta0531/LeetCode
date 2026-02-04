// Last updated: 2/4/2026, 12:27:57 PM
class Solution {
    class Pair {
        int vrtx ;
        Long score ;
        Pair(int vrtx, Long score){
            this.vrtx = vrtx ;
            this.score =score;
        }
    }
    public int edgeScore(int[] edges) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        int n= edges.length;
        for ( int i=0; i<n ;i++){
            map.put(i,new HashSet<>());
        }
        for (int i = 0 ; i<n ;i++){
            map.get(edges[i]).add(i);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
            if(a.score != b.score) 
            return Long.compare(b.score , a.score);
            return Integer.compare(a.vrtx ,b.vrtx);
        });

        //HashSet<Integer> visited = new HashSet<>();
        for (int i = 0; i< n ;i++){
            pq.add(new Pair(i ,sum(map.get(i))));
        }
        return pq.poll().vrtx;
        
    }
    public long sum(HashSet<Integer> set){
        long sum = 0 ;
        for (int x: set){
            sum+=x;
        }
        return sum;
    }
}