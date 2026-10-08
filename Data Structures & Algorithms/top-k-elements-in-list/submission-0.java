class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int brpoj = map.get(nums[i]);
                map.put(nums[i], ++brpoj);
            }else{
                map.put(nums[i],1);
            }
        }

        int[] resp = new int[k];

        for(int i = 0; i < k; i++){
            int maxKey = 0;
            int maxValue =0;

            for(var entry: map.entrySet()){
                if(entry.getValue() > maxValue){
                    maxValue = entry.getValue();
                    maxKey = entry.getKey();
                }
            }
            
            resp[i] = maxKey;
            map.remove(maxKey, maxValue);
        }

        return resp;
    }
}
