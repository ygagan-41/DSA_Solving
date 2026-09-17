class Solution {
    public int singleNumber(int[] nums) {
        int size = nums.length;
        int ans = 0;
        for(int i=0;i<size;i++){
            ans = ans^nums[i];
        }
        return ans;
    }
}