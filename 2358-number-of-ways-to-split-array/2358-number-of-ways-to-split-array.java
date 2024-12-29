class Solution {
    public int waysToSplitArray(int[] nums) {
        int N = nums.length;
        long[] ps = new long[N];
        ps[0] = nums[0];
        for(int i = 1; i < N; i++){
            ps[i] = (long) ps[i - 1] + nums[i];
        }
        int count = 0;
        long totalSum = ps[N - 1];
        for(int i = 0; i < N - 1; i++){
            if(ps[i] >= totalSum - ps[i]){
                count++;
            }
        }
        return count;
    }
}