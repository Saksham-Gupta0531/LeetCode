# Last updated: 7/31/2025, 12:28:30 PM
class Solution:
    def maxDiff(self, num: int) -> int:
        # Maximize
        n = list(str(num))
        changed = None
        for i in range(len(n)):
            if changed is None and n[i] != '9':
                changed = n[i]
                n[i] = '9'
            elif n[i] == changed:
                n[i] = '9'
        n1 = int("".join(n))

        # Minimize
        n = list(str(num))
        changed = None
        f = None
        if n[0] != '1':
            changed = n[0]
            f = '1'
            n[0] = '1'
            for i in range(1, len(n)):
                if n[i] == changed:
                    n[i] = '1'
        else:
            for i in range(1, len(n)):
                if n[i] != '0' and n[i] != '1':
                    changed = n[i]
                    f = '0'
                    break
            if changed:
                for i in range(1, len(n)):
                    if n[i] == changed:
                        n[i] = '0'
        n2 = int("".join(n))

        return n1 - n2
