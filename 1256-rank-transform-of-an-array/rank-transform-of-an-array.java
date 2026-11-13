class Solution {
    public int[] arrayRankTransform(int[] arr) {
        //temp array
        int [] temp = new int[arr.length];
        for(int i=0 ; i<temp.length ; i++){
            temp[i] = arr[i];
        }

        //sort temp array
        Arrays.sort(temp);

        //map
        Map<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        for(int i=0 ; i<temp.length; i++){
            if( i>0 && temp[i] != temp[i-1]){
                rank++;
            }
            map.put(temp[i],rank);
        }

        //calculating ranks
        int [] rank_array = new int[temp.length];
        for(int i=0 ; i<rank_array.length ; i++){
            rank_array[i] = map.get(arr[i]);
        }

        return rank_array;
    }
}