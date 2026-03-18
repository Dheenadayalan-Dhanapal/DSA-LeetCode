class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentSubset = new ArrayList<>();
        if(n < 1){
            return result;
        }
        int[] arr = new int[n];
        for(int i = 1; i <= n; i++){
            arr[i - 1] = i;
        }
        Backtrack(n, k, 0, result, currentSubset, arr);
        return result;
    }
    public void Backtrack(int n, int k, int idx, List<List<Integer>> result, List<Integer> currentSubset, int[] arr){
        if(currentSubset.size() == k){
            result.add(new ArrayList<>(currentSubset));
            return;
        }
        for(int i = idx; i < n; i++){
            // Include
            currentSubset.add(arr[i]);
            // Backtracking
            Backtrack(n, k, i + 1, result, currentSubset, arr);
            // Exclude
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
}