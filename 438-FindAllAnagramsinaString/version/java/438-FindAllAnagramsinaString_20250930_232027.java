// Last updated: 9/30/2025, 11:20:27 PM
import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] arr = new int[26];   
        int[] arr2 = new int[26]; 

        for (int i = 0; i < p.length(); i++) {
            arr[p.charAt(i) - 'a']++;
            arr2[s.charAt(i) - 'a']++;
        }

        int strt = 0;

        if (Arrays.equals(arr, arr2)) {
            result.add(strt);
        }

        for (int end = p.length(); end < s.length(); end++) {
            arr2[s.charAt(end) - 'a']++;         
            arr2[s.charAt(strt) - 'a']--;        
            strt++;

            if (Arrays.equals(arr, arr2)) {
                result.add(strt);
            }
        }

        return result;
    }
}
