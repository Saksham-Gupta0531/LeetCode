// Last updated: 9/26/2025, 11:38:52 PM
class Solution {
    public int findJudge(int n, int[][] trust) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i =0 ;i < trust.length ;i++){
            set.add(trust[i][0]);
        }
       // System.out.print(set);
        if (set.size()!=n-1) return -1;

        int sum = n*(n+1)/2;
        for(int x: set){
            sum =sum-x;
        }
        int j= sum ;
        int c= 0 ;
        for(int i = 0 ; i<trust.length ;i++){
            if (j == trust[i][1]) c++;
        }
        if (c == n-1){
            return j;
        }
        return -1;
    }
}