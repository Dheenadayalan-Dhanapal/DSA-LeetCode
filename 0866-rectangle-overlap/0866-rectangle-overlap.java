class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int fx1 = rec1[0];
        int fx2 = rec1[2];
        int fy1 = rec1[1];
        int fy2 = rec1[3];

        int sx1 = rec2[0];
        int sx2 = rec2[2];
        int sy1 = rec2[1];
        int sy2 = rec2[3];

        return !((sy1 >= fy2) || 
                 (fy1 >= sy2) || (fx1 >= sx2) || (sx1 >= fx2));
    }
}