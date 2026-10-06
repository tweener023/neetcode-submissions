class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        boolean isVidjen = false;
        Set<Integer> vidjeni = new HashSet<>();

        for(int num:nums){
            if(vidjeni.contains(num)){
                isVidjen = true;
            }

            vidjeni.add(num);
        }
        return isVidjen;
    }
}