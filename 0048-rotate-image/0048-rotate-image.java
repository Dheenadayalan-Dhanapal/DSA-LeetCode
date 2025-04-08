class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for(int i = 0; i < n; i++){
            int start = 0;
            int end = matrix.length - 1;
            int tmp = 0;
            while(start < end){
                tmp = matrix[i][end];
                matrix[i][end] = matrix[i][start];
                matrix[i][start] = tmp;
                start++;
                end--;
            }
        }
    }
}