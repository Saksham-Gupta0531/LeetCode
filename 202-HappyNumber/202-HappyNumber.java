// Last updated: 9/4/2025, 6:14:22 AM
class Solution {  
    
    public boolean isHappy(int n) {  
        Set<Integer> vis = new HashSet<>();  
        while (n != 1 && !vis.contains(n)) {  
            vis.add(n);  
            n = sqSum(n);  
        }  
        return n == 1;  
    }  
    
    private int sqSum(int n) {  
        int s = 0;  
        while (n > 0) {  
            int d = n % 10;  
            s += d * d;  
            n /= 10;  
        }  
        return s;  
    }  
}  