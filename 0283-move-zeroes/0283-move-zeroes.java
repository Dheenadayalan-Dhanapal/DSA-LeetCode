class Solution {
    public void moveZeroes(int[] nums) {
        int N = nums.length;
        int k = 0;
        for(int i = 0; i < N; i++){
            if(nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }
        }
        while(k < N){
            nums[k] = 0;
            k++;
        }
    }
}