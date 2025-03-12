class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        // Initialize result array
        int[] result = new int[n];
        
        // Calculate products of elements to the left of each element
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }
        
        // Calculate products of elements to the right of each element and multiply with the left product
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        return result;
    }
}
