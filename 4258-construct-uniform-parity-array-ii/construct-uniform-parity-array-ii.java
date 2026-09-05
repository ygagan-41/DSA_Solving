class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        int smallest = nums1[0];
        for(int i=1 ; i<nums1.length; i++){
            if(nums1[i] % 2 != smallest % 2){
                if( smallest % 2== 0){
                    return false;
                }
            }
        }
        return true;
    }
}