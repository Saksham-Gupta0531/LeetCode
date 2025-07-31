// Last updated: 7/31/2025, 12:29:35 PM
class Solution {
    public int splitArray(int[] nums, int k) {
        int s = 0;
		int e = 0;
		int ans = 0;
		for(int i = 0; i<nums.length; i++) {
			e += nums[i];
		}
		while(s<=e) {
			int mid = s + (e-s)/2;
			if(ispossible(nums, k, mid) == true) {
				ans = mid;
				e = mid - 1;
			}
			else {
				s = mid + 1;
			}
		}
		return ans;
    }
    public static boolean ispossible(int[] nums, int nos, int mid) {
		int student_count = 1;
	    int nums_sum = 0;
	    for(int i = 0; i<nums.length; i++){
	        if(nums_sum + nums[i] <= mid){
	            nums_sum += nums[i];
	        }
	        else{
	            student_count ++;

	            if(student_count > nos || nums[i] > mid)
	            {
	                return false;
	            }
	            nums_sum = nums[i];
	        }
	    }
	    return true;   
	}
}