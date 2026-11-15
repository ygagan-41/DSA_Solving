class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int size = nums.length;
        int subsets = 1 << size;

        List<List<Integer>> al = new ArrayList<>();
        for(int i=0; i<subsets ; i++){
            List<Integer> subal = new ArrayList<>();
            for(int j=0 ; j<size ; j++){
                if(( i & (1 << j)) != 0){
                    subal.add(nums[j]);
                }
            }
             al.add(subal);
        }
        return al;
    }
}