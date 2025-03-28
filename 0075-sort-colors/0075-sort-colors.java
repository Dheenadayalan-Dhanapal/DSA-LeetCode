class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int[] arr = new int[3];
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                arr[0]++;
            } else if(nums[i] == 1){
                arr[1]++;
            } else {
                arr[2]++;
            }
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