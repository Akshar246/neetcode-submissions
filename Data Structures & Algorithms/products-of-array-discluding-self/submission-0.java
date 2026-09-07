class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        // Set all value to 1 by default
        Arrays.fill(result, 1);

        // Prefix 
        int prefix = 1;
        for (int i = 0; i < nums.length; i++){
            result[i] = prefix;
            prefix = prefix * nums[i];
        }

        // Suffix
        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i --) {
            result[i] = result[i] * suffix;
            suffix = suffix * nums[i];
        }
        return result;
    }
}  
