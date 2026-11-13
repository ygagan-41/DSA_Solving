class Solution {
    public int[] arrayRankTransform(int[] arr) {
        //temporaray array
        int[] temp = new int[arr.length];
        for(int i=0 ; i<arr.length; i++){
            temp[i] = arr[i];
        }

        //sort temp array
        Arrays.sort(temp);

        //Map
        Map<Integer,Integer> map = new HashMap<>();
        int rank = 1;

        for(int i=0 ; i<temp.length ; i++){
            if(i>0 && temp[i] != temp[i-1]){
                rank++;
            }
            map.put(temp[i],rank);
        }

        //ranks
        int[] ranks = new int[temp.length];
        for(int i=0; i<arr.length ; i++){
            ranks[i] = map.get(arr[i]);
        }
        return ranks;
    }
}