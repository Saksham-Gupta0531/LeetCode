// Last updated: 2/4/2026, 12:31:34 PM
class Solution {
    public int findLHS(int[] nums) {
        int n =  nums.length ;
        HashMap<Integer ,Integer> map = new HashMap<>();
        for(int i= 0;i <n ;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Integer> Keys = new ArrayList<>(map.keySet());
        Collections.sort(Keys);
        n = 0;
        for (int i =1 ; i<Keys.size() ;i++){
            //System.out.print(Keys.get(i-1)+""+Keys.get(i)+"    ");
            if (Keys.get(i)-Keys.get(i-1) ==1){
                if ( n< map.get(Keys.get(i))+map.get(Keys.get(i-1)))
                    n=map.get(Keys.get(i))+map.get(Keys.get(i-1));
            }
        }
        return n;
    }
}