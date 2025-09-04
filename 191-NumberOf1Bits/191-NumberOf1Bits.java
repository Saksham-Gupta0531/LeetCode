// Last updated: 9/4/2025, 6:14:25 AM
class Solution {
    public int hammingWeight(int n) {
        int c=0;
        int a=1;
        for(int i=0;i<32 ;i++)
            {if (((n >> i) & a)!=0)
                c ++;}
        
        return (c);
    }
}