class Solution {
    public int maxSubArray(int[] nums) {
        return findmsa(nums, 0, nums.length - 1);
    }

    public int findmsa(int[] arr, int s, int e) {
        if (s == e) {
            return arr[s];
        }

        int mid = s + (e - s) / 2;
        int left = findmsa(arr, s, mid);
        int right = findmsa(arr, mid + 1, e);
        int cross = crossmsa(arr, s, mid, e);

        return Math.max(Math.max(left, right), cross);
    }

    public int crossmsa(int[] arr, int s, int mid, int e) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= s; i--) {
            sum += arr[i];
            leftSum = Math.max(leftSum, sum);
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= e; i++) {
            sum += arr[i];
            rightSum = Math.max(rightSum, sum);
        }

        return leftSum + rightSum;
    }
}
