class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] res = new int[numRows][numRows];
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j <= i; j++){
                if(i == 0 || j == 0){
                    res[i][0] = 1;
                }else{
                    res[i][j] = res[i-1][j-1] + res[i-1][j];
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int[] i : res){
            ArrayList<Integer> j = new ArrayList<>();
            for(int k : i){
                if(k > 0){
                    j.add(k);
                }
            }
            ans.add(j);
        }
        return ans;
    }
}