class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int N = arr.length;
        int count = 0;
        for(int i = 0; i < N; i++){
            int total = (i + 1) * (N - i);
            count += arr[i] * ((total + 1) / 2);
        }
        return count;
    }
}