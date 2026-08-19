class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        int k = n - 1;
        while(i<=k){
            if(nums[i] != val){
                i++;
            }
            else{
                //replace it with k position
                //but if k position is equals to val move forward
                if(nums[k] == val){
                    k--;
                }
                //swap i and k
                else{
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k--;
                }
            }
        }
        return k+1;
    }
}