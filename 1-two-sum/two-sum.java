class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        for(int i=0 ; i<size-1 ; i++){
            for(int j=i+1 ; j<size ; j++){
                if(nums[i] + nums[j] == target){
                    int[] ans = {i,j};
                    return ans;
                }
            }
        }
    return new int[] {};
    }
}