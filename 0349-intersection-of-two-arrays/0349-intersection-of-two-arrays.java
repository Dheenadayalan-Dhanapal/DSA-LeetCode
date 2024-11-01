class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<Integer>();
        for(int x: nums1){
            s.add(x);
        }
        List<Integer> ans = new ArrayList<Integer>(); 
        for(int x: nums2){
            if(s.contains(x)){
                ans.add(x);
                s.remove(x);
            }
        }
        int[] res = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}