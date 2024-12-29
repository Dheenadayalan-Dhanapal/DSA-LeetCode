class Solution {
    public int largestAltitude(int[] gain) {
        int ps[] = new int[gain.length];
        ps[0] = gain[0];
        int max = 0;
        for(int i = 1; i < gain.length; i++){
            ps[i] = ps[i - 1] + gain[i];
        }
        for(int val: ps){
            max = Math.max(max,val);
        }
        return max;
    }
}