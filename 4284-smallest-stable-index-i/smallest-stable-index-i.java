class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int size = nums.length;
        int ans = -1;
        for(int i = 0; i<size; i++){
            //find max from 0 to i 
            int leftMax = nums[0];

            for(int j = 1 ; j<=i ; j++){
                leftMax = Math.max(leftMax,nums[j]);
            }

            //find minimum from i to end
            int rightMin = nums[i];

            for(int j = i+1 ; j<size ; j++){
                rightMin = Math.min(rightMin,nums[j]);
            }
            int instability = leftMax - rightMin;
            if(instability <= k){
                return i;
            }
        }
        return -1;
    }
}