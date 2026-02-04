// Last updated: 2/4/2026, 12:31:41 PM
class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for(int  i= 0 ; i< score.length ;i++){
            q.add(new int[]{score[i],i});
        }
    
        String[] s= new String[q.size()];
        int rank = 1;
        while (!q.isEmpty()) {
            int[] a = q.poll();
            if (rank ==1) {
                s[a[1]] ="Gold Medal";
            } else if (rank ==2) {
                s[a[1]] ="Silver Medal";
            } else if (rank ==3) {
                s[a[1]] ="Bronze Medal";
            } else {
                s[a[1]] =Integer.toString(rank);
            }
            rank++;
        }
        return s;
    }
}