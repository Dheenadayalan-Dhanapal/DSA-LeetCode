class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] res = new int[N];
        int[] ps = new int[N];
        int[] ss = new int[N];
        ps[0] = 1;
        ss[N - 1] = 1;
        // Prefix Sum
        for(int i = 1; i < N; i++){
            ps[i] = ps[i - 1] * nums[i - 1];
        }
        // Suffix Sum
        for(int i = N - 2; i >= 0; i--){
            ss[i] = ss[i + 1] * nums[i + 1];
        }
        // Product Array
        for(int i = 0; i < N; i++){
            res[i] = ps[i] * ss[i];
        }
        return res;
    }
}