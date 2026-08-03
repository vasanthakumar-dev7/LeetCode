class Solution {
    public boolean isPowerOfFour(int n) {
        return 0<n && ((n&(n-1))==0);
    }
}