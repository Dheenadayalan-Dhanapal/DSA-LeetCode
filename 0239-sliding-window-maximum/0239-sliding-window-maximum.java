class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int N = nums.length;
        Deque<Integer> dq = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < k; i++){
            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        ans.add(nums[dq.peekFirst()]);
        for(int i = 1; i <= N - k; i++){
            int end = i + k - 1;
            while(!dq.isEmpty() && nums[end] >= nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(end);
            while(!dq.isEmpty() && dq.peekFirst() < i){
                dq.pollFirst();
            }
            ans.add(nums[dq.peekFirst()]);
        }
        int[] r = ans.stream().mapToInt(i -> i).toArray();
        return r;
    }
}