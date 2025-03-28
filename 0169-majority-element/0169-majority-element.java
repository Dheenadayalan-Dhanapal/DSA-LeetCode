class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i])){
                int freq = map.get(nums[i]);
                map.put(nums[i],freq + 1);
            } else {
                map.put(nums[i],1);
            }
        }
        int mid = n / 2;
        for(Map.Entry<Integer,Integer> map1 : map.entrySet()){
            if(map1.getValue() > mid){
                res = map1.getKey();
            }
        }
        return res;
    }
}