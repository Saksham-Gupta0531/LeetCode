// Last updated: 2/4/2026, 12:26:58 PM
class Solution {
    class Pair {
        int row;
        int col;
        int health;

        Pair(int row, int col, int health) {
            this.row = row;
            this.col = col;
            this.health = health;
        }
    }

    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(b.health, a.health));
        int[][] dir = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        pq.add(new Pair(0, 0, health-grid.get(0).get(0)));
        boolean[][] visited = new boolean[grid.size()][grid.get(0).size()];
        while (!pq.isEmpty()) {
            //Remove
            Pair rv = pq.poll();
            //Ignore
            if (visited[rv.row][rv.col])
                continue;
            //Mark as visited
            visited[rv.row][rv.col] = true;
            //Self work
            if (rv.row == grid.size() - 1 && rv.col == grid.get(0).size()-1 && rv.health > 0)
                return true;
            //Add unvisited nbrs
            for (int[] a : dir) {
                int currRow = rv.row + a[0];
                int currCol = rv.col + a[1];
                int currHealth = rv.health;
                if (currRow < 0 || currRow >= grid.size() || currCol >= grid.get(0).size() || currCol < 0)
                    continue;

                if (grid.get(currRow).get(currCol) == 1)
                    currHealth = currHealth - 1;
                if (!visited[currRow][currCol])
                    pq.add(new Pair(currRow, currCol, currHealth));
            }
        }
        return false;
    }

}