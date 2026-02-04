// Last updated: 2/4/2026, 12:27:35 PM
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while( i < nums1.length && j< nums2.length){
            if (nums1[i][0]==nums2[j][0]){
                ans.add(new int[] {nums1[i][0],nums1[i][1]+nums2[j][1]});
                i++;
                j++;
            }
           
            else if( nums1[i][0] > nums2[j][0]){
                ans.add(new int[] {nums2[j][0],nums2[j][1]});
                j++;
            }
             else if( nums1[i][0] < nums2[j][0]){
                ans.add(new int[] {nums1[i][0],nums1[i][1]});
                i++;
            }
        }

        while( i!= nums1.length){
            ans.add(new int[] {nums1[i][0],nums1[i][1]});
            i++;
        }
        while( j!= nums2.length){
            ans.add(new int[] {nums2[j][0],nums2[j][1]});
            j++;
        }
        int[][] result= ans.toArray(new int[0][0]);
        return result;
    }
}