// Last updated: 2/4/2026, 12:29:39 PM
class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        
        ArrayList<int[]> arr = new ArrayList<>();
        for (int i= 0 ; i< restaurants.length ;i++){
            if ((veganFriendly == 0 || restaurants[i][2] == 1) && restaurants[i][3]<=maxPrice && restaurants[i][4]<=maxDistance){
                arr.add(new int[]{restaurants[i][0], restaurants[i][1]});
            }
        }
        for (int i = 0; i < arr.size(); ++i) {
            int key1 = arr.get(i)[1];
            int[] key = arr.get(i);
            int j = i - 1;
            while (j >= 0 && (arr.get(j)[1] < key[1] || (arr.get(j)[1] == key[1] && arr.get(j)[0] < key[0]))) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1 , key);
        }
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=0 ; i<arr.size() ;i++ ){
            num.add( arr.get(i)[0]);
        }
        return num;
        
    }

}