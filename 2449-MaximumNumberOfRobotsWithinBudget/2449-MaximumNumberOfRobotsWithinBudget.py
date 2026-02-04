# Last updated: 2/4/2026, 12:27:58 PM
class Solution:
    def maximumRobots(self, chargeTimes, runningCosts, budget):
        n = len(chargeTimes)
        dq = [0] * n
        head = 0
        tail = -1

        total = 0
        left = 0
        ans = 0

        for right in range(n):
            total += runningCosts[right]

            while head <= tail and chargeTimes[dq[tail]] <= chargeTimes[right]:
                tail -= 1
            tail += 1
            dq[tail] = right

            while head <= tail and (chargeTimes[dq[head]] + (right - left + 1) * total) > budget:
                if dq[head] == left:
                    head += 1
                total -= runningCosts[left]
                left += 1

            if right - left + 1 > ans:
                ans = right - left + 1

        return ans
