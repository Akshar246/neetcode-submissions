class Solution {
    public int trap(int[] height) {
        // Base case: if the array is empty, no water can be trapped
        if (height == null || height.length == 0) return 0;

        // Initialize pointers at the far ends of the array
        int left = 0;
        int right = height.length - 1;

        // Variables to track the highest bars seen so far from both sides
        int leftMax = 0;
        int rightMax = 0;
        
        int totalWater = 0;

        // Loop until the two pointers meet in the middle
        while (left < right) {
            
            // We process the side with the shorter current height
            if (height[left] < height[right]) {
                // If current bar is taller than leftMax, update leftMax (no water trapped)
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    // Otherwise, calculate water and add to total
                    totalWater += leftMax - height[left];
                }
                left++; // Move the pointer inward
                
            } else { // height[right] <= height[left]
                // If current bar is taller than rightMax, update rightMax
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    // Otherwise, calculate water and add to total
                    totalWater += rightMax - height[right];
                }
                right--; // Move the pointer inward
            }
        }

        return totalWater;
    }
}
