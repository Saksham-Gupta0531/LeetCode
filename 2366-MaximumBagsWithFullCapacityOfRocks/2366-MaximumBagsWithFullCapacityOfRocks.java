// Last updated: 2/4/2026, 12:28:12 PM
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        for (int i = 0; i< rocks.length  ;i++){
            rocks[i]= capacity[i] - rocks[i];
        }
        Arrays.sort(rocks);
        int c= 0;
        for(int i =0 ;i < rocks.length && rocks[i]-additionalRocks<=0; i++){
            c++;
            additionalRocks = additionalRocks- rocks[i];


        }
        return c;
    }
}