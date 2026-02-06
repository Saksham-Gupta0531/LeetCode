// Last updated: 2/6/2026, 11:22:27 PM
1class TreeAncestor {
2    int max=17;
3    int[][] table;
4
5    public TreeAncestor(int n, int[] parent) {
6        build(parent);
7    }
8    
9    public int getKthAncestor(int node, int k) {
10        for(int i=0;i<max;i++){
11            if(node==-1)return -1;
12            int mask=1<<i;
13            if((k&mask)>0){
14                node=table[i][node];
15                if(node==-1)return -1;
16            }
17        }
18        return node;
19    }
20    public void build(int[] parent){
21        int n=parent.length;
22        table=new int[max][n];
23        for(int i=0;i<n;i++){
24            table[0][i]=parent[i];
25        }
26        for(int i=1;i<max;i++){
27            for(int j=0;j<n;j++){
28                int prev=table[i-1][j];
29                if(prev==-1){
30                    table[i][j]=-1;
31                }
32                else{
33                    table[i][j]=table[i-1][prev];
34                }
35            }
36        }
37    }
38
39}
40
41/**
42 * Your TreeAncestor object will be instantiated and called as such:
43 * TreeAncestor obj = new TreeAncestor(n, parent);
44 * int param_1 = obj.getKthAncestor(node,k);
45 */