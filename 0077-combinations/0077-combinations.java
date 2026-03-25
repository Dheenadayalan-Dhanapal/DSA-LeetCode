class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }
        Backtracking(n, k, 0, new ArrayList<>(), result, arr);
        return result;
    }

    public void Backtracking(int n, int k, int idx, List<Integer> currentSubset, List<List<Integer>> result, int[] arr) {
        if (currentSubset.size() == k) {
            result.add(new ArrayList<>(currentSubset));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            currentSubset.add(arr[i]);
            Backtracking(n, k, i + 1, currentSubset, result, arr);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
}
