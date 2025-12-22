// Last updated: 12/22/2025, 9:59:21 PM
1class Solution {
2    public String pushDominoes(String dominoes) {
3        int n=dominoes.length(),i,j=Integer.MIN_VALUE;
4        char dom[]=dominoes.toCharArray(), res[]=new char[n];
5        boolean r = false,l=true;
6        for(i=0;i<n;i++){
7            res[i]=dom[i];
8            if(dom[i]=='L'){
9                if(l){ 
10                    fill(j,i,res,0,-1);
11                    if(j>=0) res[j]='L';
12                }
13                else fill(j,i,res,1,-1);
14                l=true;
15                j=i;
16            }else if(dom[i]=='R' || i==n-1){
17                if(!l){
18                    fill(j,i,res,1,0);
19                    res[i]='R';
20                }
21                j=i;
22                l=false;
23            }
24        }
25        return new String(res);
26    }
27    void fill(int j, int i, char[] res, int incrj, int incri){
28        for(;j<i && i>=0;j+=incrj,i+=incri){
29            if(j>=0) res[j]='R';
30            res[i]='L';
31        }
32    }
33}
34