// Last updated: 2/4/2026, 12:30:36 PM
class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        int max = 0 ;
        for (int i =0 ; i<nums.length ;i++ ){
            max= Math.max(max , nums[i]);
        }
        int ans =0 ;
        
        int left =1 ;
        int right = max ;
        while (left <= right ){
            int mid = (left +(right -left)/2);
            if (check(nums ,mid ,h)){
                ans = mid; 
                right = mid-1;}
            else 
                left = mid +1;        
        }
        return ans ;
    }
    public boolean check(int[] nums , int ba ,int h){
        int time = 0;
        for ( int x : nums){
            int t = (int)Math.ceil((double)x / ba);
            time+=t;
            if (time > h){
                return false ;
            }
            
        }
        //if(time <= h) return true;
        return true ;
    }
}