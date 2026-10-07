class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> vidjeni = new HashSet<>();
        
        for(int num:nums){
            if(vidjeni.contains(num)){
                return true;
            }
            vidjeni.add(num);
        }
        return false;
    }
}