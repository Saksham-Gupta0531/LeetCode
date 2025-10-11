// Last updated: 10/11/2025, 9:14:08 PM
class ExamTracker {

    public TreeMap<Integer, Long> map;
    public ExamTracker() {
        map = new TreeMap<>();
    }
   
    public void record(int time, int score) {
        long prev = 0;
        Integer last = map.floorKey(time);
        if(last != null){
            prev = map.get(last);
        }
        map.put(time, prev+score);
    }
   
    public long totalScore(int startTime, int endTime) {
        long end = 0;
        long start = 0;
        Integer eKey = map.floorKey(endTime);
        if(eKey != null){
            end  = map.get(eKey);
        }
        Integer sKey = map.floorKey(startTime-1);
        if(sKey != null){
            start = map.get(sKey);
        }
        return end - start;
    }
}
