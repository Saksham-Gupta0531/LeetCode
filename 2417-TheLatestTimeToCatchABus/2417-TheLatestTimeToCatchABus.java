// Last updated: 2/4/2026, 12:28:06 PM
class Solution {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        
        Arrays.sort(passengers);
        Arrays.sort(buses);
        if (passengers[0]>buses[buses.length-1]) {
            return buses[buses.length-1];
        }
        int count=0,j=0,ans=passengers[0]-1, lastPassenger=passengers[0];
        for (int i=0;i<buses.length;i++) {
            while (j<passengers.length && passengers[j]<=buses[i] && count<capacity) {
                count++;
                lastPassenger = passengers[j];
                if(j > 0 && lastPassenger - passengers[j-1] != 1){
                    ans=passengers[j]-1;
                }
                j++;
            }
            if(j>0 && count<capacity && lastPassenger != buses[i]){
             ans=buses[i];
            }
            count=0;
        }
        return ans;
    }
}