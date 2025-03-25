class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int N = nums.length;
        int count = 0;
        int max = 0;
        for(int i = 0; i < N; i++){
            if(nums[i] == 1){
                count = count + 1;
                if(count > max){
                    max = count;
                }
            } else{
                count = 0;
            }
        }
        return max;
    }
}