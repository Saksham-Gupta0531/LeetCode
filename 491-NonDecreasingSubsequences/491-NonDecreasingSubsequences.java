// Last updated: 2/4/2026, 12:31:46 PM
class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        //Arrays.sort(nums);
        List<List<Integer>> lst = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        search(nums , 0 ,-101,set ,new ArrayList<>());
        for (List<Integer> temp : set){
            lst.add(temp);
        }
        return lst;
    }
    public void search(int[] nums , int i ,int last,HashSet<List<Integer>> ans ,List<Integer> list){
        if(i == nums.length ){
            if ( list.size()>=2)
                ans.add(new ArrayList<>(list));
            return ;
        }
        search(nums ,i+1 ,last ,ans,list);
        if( nums[i]>= last){
            list.add(nums[i]);
            search(nums ,i+1 ,nums[i],ans ,list);
            list.remove(list.size()-1);
        }
    }
}