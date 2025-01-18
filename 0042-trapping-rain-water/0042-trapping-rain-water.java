class Solution {
    public int trap(int[] height) {
        int N = height.length;
        // Construct Left Max Array
        int[] lmax = new int[N];
        lmax[0] = 0;
        for(int i = 1; i < N; i++){
            lmax[i] = Math.max(lmax[i - 1],height[i - 1]);
        }
        // Construct Right Max Array
        int[] rmax = new int[N];
        rmax[N-1] = 0;
        for(int i = N-2; i >= 0; i--){
            rmax[i] = Math.max(rmax[i + 1], height[i + 1]);
        }
        int sum = 0;
        for(int i = 1; i < N-1; i++){
            int water = Math.min(lmax[i],rmax[i]) - height[i];
            if(water > 0){
                sum += water;
            } 
        }
        return sum;
    }
}