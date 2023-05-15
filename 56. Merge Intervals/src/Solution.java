class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length < 2) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> result = new ArrayList<>();

        int[] myInterval = intervals[0];
        result.add(myInterval);

        for(int[] interval : intervals) {
            if(interval[0] <= myInterval[1]) {
                myInterval[1] = Math.max(myInterval[1], interval[1]);
            } else {
                myInterval = interval;
                result.add(myInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}