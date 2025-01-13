class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0; i < mat.length; i++){
            sum = sum + mat[i][i];
        }
        int row = 0;
        int col = mat[0].length - 1;
        while(row < mat.length){
            if(row != col){
                sum += mat[row][col];
            }
            row++;
            col--;
        }
        return sum;
    }
}