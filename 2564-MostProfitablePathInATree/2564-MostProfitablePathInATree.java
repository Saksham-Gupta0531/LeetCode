// Last updated: 2/4/2026, 12:27:50 PM
class Solution {
    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for(int i = 0; i<amount.length; i++){
            map.put(i, new HashSet<>());
        }
        for(int[] arr : edges){
            map.get(arr[0]).add(arr[1]);
            map.get(arr[1]).add(arr[0]);
        }
        int[] bobPath = new int[amount.length];
        Arrays.fill(bobPath, -1);
        ArrayList<Integer> path = new ArrayList<>();
        bobDfs(bob, -1, path, map);
        for(int i = 0; i<path.size(); i++){
            bobPath[path.get(i)] = i;
        }
        return aliceDfs(0, -1, 0, bobPath, map, 0, amount);
    }
    public boolean bobDfs(int vtx, int parent, ArrayList<Integer> path, HashMap<Integer, HashSet<Integer>> map){
        if(vtx == 0) return true;
        for(int nbrs : map.get(vtx)){
            if(nbrs != parent){
                path.add(vtx);
                if(bobDfs(nbrs, vtx, path, map)) return true;
                path.remove(path.size()-1);
            }
        }
        return false;
    }
    public int aliceDfs(int vtx, int parent, int score, int[] bobPath, HashMap<Integer, HashSet<Integer>> map, int time, int[] amt){
        if(bobPath[vtx] == -1 || bobPath[vtx] > time) score += amt[vtx];
        else if(bobPath[vtx] == time) score += amt[vtx]/2;
        if(map.get(vtx).size() == 1 && vtx != 0) return score;
        int maxScore = Integer.MIN_VALUE;
        for(int nbrs : map.get(vtx)){
            if(nbrs != parent){
                maxScore = Math.max(maxScore, aliceDfs(nbrs, vtx, score, bobPath, map, time+1, amt));
            }
        }
        return maxScore;
    }
}