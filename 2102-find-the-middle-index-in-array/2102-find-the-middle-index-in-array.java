class Solution {
    public int findMiddleIndex(int[] nums) {
        int N = nums.length;
        int ts = 0;
        int[] ps = new int[N];
        ps[0] = nums[0];
        for(int i = 1; i < N; i++){
            ps[i] = ps[i - 1] + nums[i];
        }
        ts = ps[N - 1]; 
        if(ts - ps[0] == 0){
            return 0;
        }
        for(int i = 1; i < N; i++){
            if(ps[i - 1] == ts - ps[i]){
                return i;
            }
        }
        return -1;
    }
}