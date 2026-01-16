// Last updated: 1/16/2026, 11:20:49 PM
1class Solution {
2   public int[] findOriginalArray(int[] changed) {
3    int[] temp = new int[changed.length/2];
4    Queue<Integer> x = new LinkedList<>();
5    Arrays.sort(changed);
6    int i = 0;
7    for(int num : changed){
8        if(!x.isEmpty() && x.peek()==num)
9            temp[i++] = x.poll()/2;
10        else x.add(num*2);
11    }
12    return x.size()>0 ? new int[]{}:temp;
13}
14}