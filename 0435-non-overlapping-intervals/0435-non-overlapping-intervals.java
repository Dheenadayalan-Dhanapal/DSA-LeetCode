class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        int start = 0;
        int count = 1;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1],b[1]));
        for(int i = 1; i < intervals.length; i++){
            if(intervals[start][1] <= intervals[i][0]){
                count++;
                start = i;
            }
        }
        return n - count;
    }
}