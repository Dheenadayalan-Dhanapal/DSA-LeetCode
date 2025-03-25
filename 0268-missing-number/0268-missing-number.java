class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;
        int xor1 = 0;
        int xor2 = 0;
        int res = 0;
        for(int i = 0; i < N + 1; i++){
            xor1 ^= i;
        }
        for(int i = 0; i < N; i++){
            xor2 ^= nums[i];
        }
        for(int i = 0; i < N; i++){
            res = xor1 ^ xor2;
        }
        return res;
    }
}