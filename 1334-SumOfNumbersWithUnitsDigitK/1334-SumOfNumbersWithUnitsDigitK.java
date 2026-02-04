// Last updated: 2/4/2026, 12:29:53 PM
class Solution {
    public int minimumNumbers(int num, int k) {
        if(num==0){
            return 0;
        }
        for(int i=1;i<=10;i++){
            if((num-(i*k))%10==0 && i * k <= num){
                return i;
            }
        }

        return -1;
    }
}