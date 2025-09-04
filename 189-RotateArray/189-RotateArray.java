// Last updated: 9/4/2025, 6:14:28 AM
class Solution {
    public void rotate(int[] nums, int k) {
        Rotate(nums,k);
    }
    public static void Rotate(int[] arr, int k) {
		int n = arr.length;
		k = k %n;
		//starting n-k reverse karo
		reverse(arr,0,n-k-1);
		
		//last ke k reverse karo
		reverse(arr,n-k,n-1);
		
		//all element reverse karo
		reverse(arr,0,n-1);
    }
	
	public static void reverse(int[] arr,int start, int end) {
		while(start<=end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
    }
}