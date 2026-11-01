class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<size ; i++){
            int need = target - nums[i];

            if(map.containsKey(need)){
                return new int[] {map.get(need),i};
            }
            map.put(nums[i] , i);
        }
        return new int[] {};
    }
}