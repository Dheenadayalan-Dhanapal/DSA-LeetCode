class Solution {
    public String getPermutation(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            nums.add(i);
        }
        boolean[] used = new boolean[n];
        Backtracking(nums, 0, used, new ArrayList<>(), result);
        List<Integer> res = result.get(k - 1);
        String out = "";
        for(int i : res){
            out += i;
        }
        return out;
    }
    public void Backtracking(List<Integer> nums, int idx, boolean[] used, List<Integer> current, List<List<Integer>> result){
        if(nums.size() == current.size()){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = 0; i < nums.size(); i++){
            if(used[i]) continue;
            used[i] = true;
            current.add(nums.get(i));
            Backtracking(nums, idx + 1, used, current, result);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}