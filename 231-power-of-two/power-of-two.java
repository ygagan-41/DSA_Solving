class Solution {
    public boolean isPowerOfTwo(int n) {
        int N = n & (n-1);
        if(n <= 0){
            return false;
        }
        if(N == 0){
            return true;
        }
        else{
            return false;
        }
    }
}