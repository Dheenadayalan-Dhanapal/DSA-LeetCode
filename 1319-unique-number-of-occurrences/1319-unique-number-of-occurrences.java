class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for(int x : arr){
            hmap.put(x, hmap.getOrDefault(x,0) + 1);
        }
        
        Set s = new HashSet<Integer>();
        for(int x : hmap.values()){
            s.add(x);
        }
        return hmap.size() == s.size();
    }
}