class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] output = new int[n];
        for(int i = 0; i < bookings.length; i++){
            int startIndex = bookings[i][0];
            int endIndex = bookings[i][1];
            for(int j = startIndex; j <= endIndex; j++){
                output[j - 1] = output[j - 1] + bookings[i][2];
            }
        }
        return output;
    }
}