class Solution {
    public int[] twoSum(int[] nums, int target) {
        

        Map<Integer, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++){

            int cilj = target - nums[i];

            if (hashmap.containsKey(cilj)){
                return new int[]{hashmap.get(cilj), i};
            }

            hashmap.put(nums[i], i);

        }
            return new int[]{};
    }
}
