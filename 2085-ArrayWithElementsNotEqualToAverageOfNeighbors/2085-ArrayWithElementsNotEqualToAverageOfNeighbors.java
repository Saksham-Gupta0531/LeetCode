// Last updated: 9/3/2025, 5:27:42 PM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length-1;
        int[] arr = Arrays.copyOf(nums,nums.length);
        Arrays.sort(arr);
        // for (int i= 0 ; i< nums.length; i++){
        //     System.out.print(nums[i]);
            
        // }
        // System.out.println();
        // for (int i= 0 ; i< nums.length; i++){
        //     System.out.print(arr[i]);
            
        // }
        for(int i=1;i<nums.length;i+=2){
            nums[i]=arr[n--];
        }
        for(int i=0;i<nums.length;i+=2){
            nums[i]=arr[n--];
        }
    return nums;
    }
}