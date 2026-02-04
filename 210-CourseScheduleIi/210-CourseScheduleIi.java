// Last updated: 2/4/2026, 12:32:48 PM
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
     HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int i = 0 ; i < numCourses ;i++){
            map.put(i,new HashSet<>());
        }
        // graph create + ingree array calc
        int[] indegre = new int[numCourses];
        for(int[] a: prerequisites){
            map.get(a[1]).add(a[0]);
            indegre[a[0]]++;
        }

        Queue<Integer> que = new LinkedList<>();
         for(int i = 0 ; i<indegre.length ; i++){
            if(indegre[i]==0){
                que.add(i);
            }
        }
        int[] ans =new int[numCourses ];
        int c= 0;
        while (!que.isEmpty()){
            int p = que.poll();
            ans[c++]=p;
            for(int nbrs : map.get(p)){
                indegre[nbrs]--;
                if (indegre[nbrs]==0) que.add(nbrs);
            }
        }


        if (c==numCourses  ) return ans;
        return new int[0];
    }
}