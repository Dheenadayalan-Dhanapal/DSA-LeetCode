class Solution {
    public int largestRectangleArea(int[] heights) {
        int N = heights.length;
        int max = Integer.MIN_VALUE;
        int[] prevSmaller = new int[N];
        int[] nextSmaller = new int[N];
        Stack<Integer> stack = new Stack<Integer>();
        // prevSmaller
        for(int i = 0; i < N; i++){
            while(!stack.isEmpty() && heights[i] <= heights[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                prevSmaller[i] = stack.peek();
            } else {
                prevSmaller[i] = -1;
            }
            stack.push(i);
        }
        stack.clear();
        // nextSmaller
        for(int i = N - 1; i >= 0; i--){
            while(!stack.isEmpty() && heights[i] <= heights[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                nextSmaller[i] = stack.peek();
            } else {
                nextSmaller[i] = N;
            }
            stack.push(i);
        }
        stack.clear();
        for(int i = 0; i < N; i++){
            int l = prevSmaller[i];
            int r = nextSmaller[i];
            int val = (r - l - 1) * heights[i];
            max = Math.max(max,val);
        }
        return max;
    }
}