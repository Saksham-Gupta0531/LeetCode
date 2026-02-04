// Last updated: 2/4/2026, 12:25:30 PM
class Solution {
    public int minimumDistance(int[] nums) {
    HashMap<Integer,ArrayList<Integer>> map= new HashMap<>();
        for (int i=0 ; i< nums.length ; i++){
            if (!map.containsKey(nums[i]))
                map.put(nums[i] ,new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int sum= Integer.MAX_VALUE;
        for ( ArrayList<Integer> values : map.values() ){
            
            if (values.size() >= 3){
                int t=0;
                for (int p = 0 ; p<=values.size()-3 ;p++){
                    int i =values.get(p);
                    int j = values.get(p+1);
                    int k= values.get(p+2);
                    t = Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
                    if(t<sum ) sum =t;
                }
            }
        }
        if (sum == Integer.MAX_VALUE) return -1;
        return sum ;
        
    }
}