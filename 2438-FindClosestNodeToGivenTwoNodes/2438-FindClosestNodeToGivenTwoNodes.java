// Last updated: 2/4/2026, 12:28:03 PM
class Solution {
    void dfs(int curr,int[] edges,int[] distance,boolean[] visited)
    {
        visited[curr] = true;
        int next = edges[curr];
        if(next != -1 && !visited[next])
        {
            distance[next] = distance[curr] + 1;
            dfs(next,edges,distance,visited);
        }
    }
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int ans = -1;
        int minDist = Integer.MAX_VALUE;

        int[] distance1 = new int[n];
        int[] distance2 = new int[n];
        boolean[] visited1 = new boolean[n];
        boolean[] visited2 = new boolean[n];

        dfs(node1,edges,distance1,visited1);
        dfs(node2,edges,distance2,visited2);

        for(int node=0;node<n;node++)
        {
            if(visited1[node] && visited2[node] && minDist>Math.max(distance1[node],distance2[node]))
            {
                minDist = Math.max(distance1[node],distance2[node]);
                ans = node;
            }
        }
        return ans;
    }
}