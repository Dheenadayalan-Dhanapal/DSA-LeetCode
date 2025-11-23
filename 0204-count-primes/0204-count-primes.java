class Solution {
    public int countPrimes(int n) {
        boolean[] composite = new boolean[n + 1];
        Arrays.fill(composite, false);
        for(int i = 2; i * i <= n; i++){
            for(int j = 2 * i; j <= n; j += i){
                if(!composite[j]){
                    composite[j] = true;
                }
            }
        }
        int count = 0;
        for(int i = 2; i < n; i++){
            if(!composite[i]) count++;
        }
        return count;
    }
}