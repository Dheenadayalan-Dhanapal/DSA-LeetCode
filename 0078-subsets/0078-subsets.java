class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        Backtracking(nums, 0, output, result);
        return result;
    }
    public void Backtracking(int[] nums, int idx, List<Integer> output, List<List<Integer>> result){
        result.add(new ArrayList<>(output));
        for(int i = idx; i < nums.length; i++){
            // Include
            output.add(nums[i]);
            // Backtracking
            Backtracking(nums, i + 1, output, result);
            // Exclude
            output.remove(output.size() - 1);
        }
    }
}