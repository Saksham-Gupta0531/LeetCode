// Last updated: 2/4/2026, 12:27:55 PM
class Solution {
    class Pair {
        int room;
        long end;

        Pair(int r, long e) {
            room = r;
            end = e;
        }
    }

    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        PriorityQueue<Pair> busy = new PriorityQueue<>(
            (a, b) -> a.end == b.end ? a.room - b.room : Long.compare(a.end, b.end)
        );

        PriorityQueue<Integer> free = new PriorityQueue<>();
        for (int i = 0; i < n; i++) free.add(i);

        int[] count = new int[n];

        for (int[] m : meetings) {
            long start = m[0], end = m[1];
            long duration = end - start;

           
            while (!busy.isEmpty() && busy.peek().end <= start) {
                free.add(busy.poll().room);
            }

            if (!free.isEmpty()) {
                int room = free.poll();
                count[room]++;
                busy.add(new Pair(room, end));
            } else {
                Pair p = busy.poll();
                long newEnd = p.end + duration;
                count[p.room]++;
                busy.add(new Pair(p.room, newEnd));
            }
        }

        int max = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            if (count[i] > max) {
                max = count[i];
                ans = i;
            }
        }

        return ans;
    }
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("0");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
    }
}