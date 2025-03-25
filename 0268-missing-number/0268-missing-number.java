class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;
        int t = N;
        int count = 0;
        int res = 0;
        while(t > 0){
            for(int i = 0; i < N; i++){
                if(nums[i] == t){
                    count = 1;
                    break;
                }
            }
            if(count == 1){
                count = 0;
            } else {
                res = t;
            }
            t--;
        }
        return res;
    }
}