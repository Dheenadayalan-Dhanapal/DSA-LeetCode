class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < n-1; i++){
            min = Math.min(min, Math.abs(arr[i+1] - arr[i]));
        }
        for(int i = 0; i < n-1; i++){
            List<Integer> tmp = new ArrayList<Integer>();
            if((arr[i + 1] - arr[i]) == min){
                tmp.add(arr[i]);
                tmp.add(arr[i+1]);
                res.add(tmp);
            }
        }
        return res;
    }
}