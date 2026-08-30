class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0){
            return false;
        }
        while(n > 1 & n%3==0){
            n = n/3;
        }
        boolean ans = (n==1);
        return ans;
    }
}