// Last updated: 1/2/2026, 10:46:45 AM
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
4        for (int i = 0 ; i < numCourses ;i++){
5            map.put(i,new HashSet<>());
6        }
7        // graph create + ingree array calc
8        int[] indegre = new int[numCourses];
9        for(int[] a: prerequisites){
10            map.get(a[1]).add(a[0]);
11            indegre[a[0]]++;
12        }
13
14        Queue<Integer> que = new LinkedList<>();
15         for(int i = 0 ; i<indegre.length ; i++){
16            if(indegre[i]==0){
17                que.add(i);
18            }
19        }
20        int c= 0;
21        while (!que.isEmpty()){
22            int p = que.poll();
23            c++;
24            for(int nbrs : map.get(p)){
25                indegre[nbrs]--;
26                if (indegre[nbrs]==0) que.add(nbrs);
27            }
28        }
29
30
31        if (c==numCourses  ) return true;
32        else return false;
33    }
34}