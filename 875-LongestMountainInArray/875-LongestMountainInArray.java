// Last updated: 7/31/2025, 12:28:57 PM
class Solution {
    public int longestMountain(int[] arr) {
        List<Integer> peak=new ArrayList<>();
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) peak.add(i);
        }

        int max=0;
        for(int i=0;i<peak.size();i++){
            int idx=peak.get(i);
            int cur=1; //current mountain length
            int left=idx-1;
            int right=idx+1;

            while(left>=0 && arr[left]<arr[left+1]){
                cur++;
                left--;
            }

            while(right<arr.length && arr[right-1]>arr[right]){
                cur++;
                right++;
            }
            max=Math.max(max,cur);
        }

        return max;
    }
}