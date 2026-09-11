class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length == 0 || nums1.length == 0){
            return;
        }

        int [] nums3 = new int[nums1.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                nums3[k] = nums1[i];
                i++;
                k++;
            }
            else{
                nums3[k] = nums2[j];
                j++;
                k++;
            }
        }
        //for remaining part
        while(i<m){
            nums3[k] = nums1[i];
            i++;
            k++;
        }

        while(j<n){
            nums3[k] = nums2[j];
            j++;
            k++;
        }

        for(int index=0 ; index<nums3.length ; index++){
            nums1[index] = nums3[index];
        }
    }
}