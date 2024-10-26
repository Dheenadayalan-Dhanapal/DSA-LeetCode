class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                count = 1;
                candidate = nums[i];
            }
            else if(candidate == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}