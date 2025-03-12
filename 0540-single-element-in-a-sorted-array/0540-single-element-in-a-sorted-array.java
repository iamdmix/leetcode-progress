class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Check if mid forms a pair with the left or right adjacent element
            if (mid % 2 == 0) { // If mid is even
                if (nums[mid] == nums[mid + 1]) {
                    start = mid + 2; // Move to the right subarray
                } else {
                    end = mid; // Move to the left subarray
                }
            } else { // If mid is odd
                if (nums[mid] == nums[mid - 1]) {
                    start = mid + 1; // Move to the right subarray
                } else {
                    end = mid; // Move to the left subarray
                }
            }
        }
        return nums[start];
    }
}