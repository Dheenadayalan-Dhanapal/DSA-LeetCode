class Solution {
    public boolean check(int[] nums) {
        int N = nums.length;
        int count = 0;
        for(int i = 0; i < N; i++){
            if(nums[i] > nums[(i+1) % N]){
                count++;
                if(count > 1){
                    return false;
                }
            }
        }
        return true;
    }
}