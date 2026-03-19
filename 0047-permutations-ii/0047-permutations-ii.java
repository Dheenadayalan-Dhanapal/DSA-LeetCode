class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        Backtracking(nums, used, new ArrayList<>(),result);
        return result;
    }
    public void Backtracking(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> result){
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i] || (i > 0 && (nums[i] == nums[i - 1])) && !used[i - 1]){
                continue;
            }
            used[i] = true;
            current.add(nums[i]);
            Backtracking(nums, used, current, result);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}