// Last updated: 9/26/2025, 9:00:55 PM
class Solution {
    public int totalFruit(int[] fruits) {
    int s =0 ; 
    int e =0 ;
    int max_size =0 ;
    
    HashMap<Integer,Integer> map = new HashMap<>();
    while(e < fruits.length){
        map.put(fruits[e], map.getOrDefault(fruits[e], 0) + 1);
    

            while (map.size() > 2) {
                map.put(fruits[s], map.get(fruits[s]) - 1);
                if (map.get(fruits[s]) == 0) {
                    map.remove(fruits[s]);
                }
                s++;
            }
        max_size = Math.max(max_size,e-s+1);
        e++;

    }
    return max_size;
        
    }
}