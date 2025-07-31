// Last updated: 7/31/2025, 12:27:50 PM
import java.util.*;
class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Hashtable<Integer ,Integer> di = new Hashtable<>();
        
        for (int x : nums) {
            di.put(x, di.getOrDefault(x, 0) + 1);
        }
        
        for ( int j : di.values() ){
            
            if (isprime(j)){
                System.out.println(j);
                return true;}
        }
        
        return false;
    }
    public static boolean isprime(int x){
    if (x < 2) return false;
    if (x == 2) return true;
    if (x % 2 == 0) return false;
    for (int i = 3; i * i <= x; i += 2) {
        if (x % i == 0) return false;
    }
    return true;
}
}