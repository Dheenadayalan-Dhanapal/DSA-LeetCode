class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int N = nums.size();
        Collections.sort(nums);
        int left = 0; 
        int right = N - 1;
        int count = 0;

        while(left < right){
            if((nums.get(left) + nums.get(right)) < target){
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}