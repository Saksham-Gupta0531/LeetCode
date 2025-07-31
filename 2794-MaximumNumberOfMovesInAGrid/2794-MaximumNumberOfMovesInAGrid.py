# Last updated: 7/31/2025, 12:28:05 PM
class Solution:
    def maxMoves(self, grid: list[list[int]]) -> int:
        m, n = len(grid), len(grid[0])
        moves = [[0] * n for _ in range(m)]
        max_moves = 0

        for col in range(n - 2, -1, -1):
            for row in range(m):
                current_val = grid[row][col]
                if row > 0 and grid[row - 1][col + 1] > current_val:
                    moves[row][col] = max(moves[row][col], 1 + moves[row - 1][col + 1])
                if grid[row][col + 1] > current_val:
                    moves[row][col] = max(moves[row][col], 1 + moves[row][col + 1])
                if row < m - 1 and grid[row + 1][col + 1] > current_val:
                    moves[row][col] = max(moves[row][col], 1 + moves[row + 1][col + 1])

        for row in range(m):
            max_moves = max(max_moves, moves[row][0])

        return max_moves
