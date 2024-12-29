class NumArray {
    public int[] Ps;
    public int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
        int N = nums.length;
        this.Ps = new int[N];
        Ps[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            Ps[i] = Ps[i - 1] + nums[i];
        }
        
    }
    
    public int sumRange(int left, int right) {
        if(left != 0){
            return Ps[right] - Ps[left] + nums[left];
        } else {
            return Ps[right];
        }  
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */