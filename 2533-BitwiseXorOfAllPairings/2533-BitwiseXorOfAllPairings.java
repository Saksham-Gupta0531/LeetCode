// Last updated: 2/4/2026, 12:27:52 PM
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        if (nums1.length%2==0 && nums2.length%2==0)return 0;
        if( nums1.length %2 == 0){
            int a =0;
            for (int i :nums1){
                a=a^i;
            }
            return a;
        }
        else if( nums2.length %2 == 0){
            int a =0;
            for (int i:nums2){
                a=a^i;
            }
            return a;
        }
        else{
            int a=0;
            for (int i:nums2){
                a=a^i;
            }
             for (int i :nums1){
                a=a^i;
            }
            return a;
        }
    }

}