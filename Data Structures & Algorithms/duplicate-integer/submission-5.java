class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seenNumber = new HashSet<>();
        for(int num : nums){
            if(seenNumber.contains(num)){
                return true; // Duplicate Found
            } 
            seenNumber.add(num);
        }
        return false;
    }
}
