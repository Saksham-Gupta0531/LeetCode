// Last updated: 2/4/2026, 12:28:22 PM
class Solution {
    public long minimalKSum(int[] nums, int k) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int n : nums)                               
            set.add(n);
        long sum = ((long)(k + 1) * (long)k) / 2;     
        int count = 0;                                
        for (Integer i : set) {
            if (i > k)                      
                break;
            else {
                sum -= i;                              
                count++;                              
            }                                          
        }
        int i = k + 1;                              
        while (count > 0) {
            if (!set.contains(i)) {
                sum += i;
                count--;
            }
            i++;
        }
        return sum;
    }
}