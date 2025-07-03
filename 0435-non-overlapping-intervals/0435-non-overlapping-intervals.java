class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1],b[1]));
        int prev = 0;
        int count = 1;
        for(int i = 1; i < n; i++){
            if(intervals[prev][1] <= intervals[i][0]){
                count++;
                prev = i;
            }
        }
        return n - count;
    }
}