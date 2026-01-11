// Last updated: 1/11/2026, 6:02:55 PM
1class Solution {
2    void dfs(int curr,int[] edges,int[] distance,boolean[] visited)
3    {
4        visited[curr] = true;
5        int next = edges[curr];
6        if(next != -1 && !visited[next])
7        {
8            distance[next] = distance[curr] + 1;
9            dfs(next,edges,distance,visited);
10        }
11    }
12    public int closestMeetingNode(int[] edges, int node1, int node2) {
13        int n = edges.length;
14        int ans = -1;
15        int minDist = Integer.MAX_VALUE;
16
17        int[] distance1 = new int[n];
18        int[] distance2 = new int[n];
19        boolean[] visited1 = new boolean[n];
20        boolean[] visited2 = new boolean[n];
21
22        dfs(node1,edges,distance1,visited1);
23        dfs(node2,edges,distance2,visited2);
24
25        for(int node=0;node<n;node++)
26        {
27            if(visited1[node] && visited2[node] && minDist>Math.max(distance1[node],distance2[node]))
28            {
29                minDist = Math.max(distance1[node],distance2[node]);
30                ans = node;
31            }
32        }
33        return ans;
34    }
35}