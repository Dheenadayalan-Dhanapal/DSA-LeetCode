class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int[] arr = new int[3];
        for(int i = 0; i < n; i++){
            arr[nums[i]]++;
        }
        int i = 0;
        int k = 0;
        while(i < 3){
            for(int j = 0; j < arr[i]; j++){
                nums[k] = i;
                k++;
            }   
            i++;
        }
    }
}