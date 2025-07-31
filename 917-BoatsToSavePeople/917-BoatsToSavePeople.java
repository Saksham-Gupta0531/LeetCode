// Last updated: 7/31/2025, 12:28:50 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0,j=people.length-1;int ans=0;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
                j--;
                ans+=1;
            }
            else{
                ans+=1;
                j--;
            }
        }
        return ans;
    }
}