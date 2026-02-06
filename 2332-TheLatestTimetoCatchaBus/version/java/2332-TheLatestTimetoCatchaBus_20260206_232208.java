// Last updated: 2/6/2026, 11:22:08 PM
1class Solution {
2    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
3        
4        Arrays.sort(passengers);
5        Arrays.sort(buses);
6        if (passengers[0]>buses[buses.length-1]) {
7            return buses[buses.length-1];
8        }
9        int count=0,j=0,ans=passengers[0]-1, lastPassenger=passengers[0];
10        for (int i=0;i<buses.length;i++) {
11            while (j<passengers.length && passengers[j]<=buses[i] && count<capacity) {
12                count++;
13                lastPassenger = passengers[j];
14                if(j > 0 && lastPassenger - passengers[j-1] != 1){
15                    ans=passengers[j]-1;
16                }
17                j++;
18            }
19            if(j>0 && count<capacity && lastPassenger != buses[i]){
20             ans=buses[i];
21            }
22            count=0;
23        }
24        return ans;
25    }
26}