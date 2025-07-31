// Last updated: 7/31/2025, 12:29:07 PM
class Solution {
    public List<Integer> partitionLabels(String s) {

        int[] map = new int[123]; // Frequency map
        for(char c: s.toCharArray()){
            map[c]++;
        }

        List<Integer> result = new ArrayList<>();
        Set<Character> set = new HashSet<>(); 
        int size = 0;

        for(char c: s.toCharArray()){
            size++;
            set.add(c); 
            if(--map[c] == 0){
                set.remove(c); 
            }
            if(set.isEmpty()){ 
                result.add(size);
                size = 0; // Reset the size
            }
        }

        return result;
    }
}