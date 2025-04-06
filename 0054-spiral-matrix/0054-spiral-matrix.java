class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lst = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return lst;
        }
        
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        
        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int j = left; j <= right; j++) {
                lst.add(matrix[top][j]);
            }
            top++;
            
            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                lst.add(matrix[i][right]);
            }
            right--;
            
            // Check if there is a bottom row to traverse
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    lst.add(matrix[bottom][j]);
                }
                bottom--;
            }
            
            // Check if there is a left column to traverse
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    lst.add(matrix[i][left]);
                }
                left++;
            }
        }
        return lst;
    }
}
