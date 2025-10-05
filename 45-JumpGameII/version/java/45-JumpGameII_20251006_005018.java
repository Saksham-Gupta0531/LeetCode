// Last updated: 10/6/2025, 12:50:18 AM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
     ArrayList<List<Integer>> r = new ArrayList<>();
     bt(r,new ArrayList<>(),nums);
     return r;
    }
    private void bt(List<List<Integer>> r, List<Integer>c ,int[] nums  ){

        if(c.size() == nums.length){
            r.add(new ArrayList<>(c));
            return  ;
        }
        for(int n : nums){
            if( !c.contains(n)){
                c.add(n);
                bt(r,c,nums);
                c.remove(c.size()-1);
            }
            
        }
    

    
    }

}