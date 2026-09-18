class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        int n = size/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<size;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        for(int key:map.keySet()){
            if(map.get(key)>n){
                 return key;
            }
        }
        return -1;
    }
}