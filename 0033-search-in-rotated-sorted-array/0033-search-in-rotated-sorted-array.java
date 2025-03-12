class Solution {
    public int search(int[] arr, int target) {
        int pivot = findpivot(arr);
        if (pivot == -1) {    // The array is not rotated.
            return BS(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0] && target <= arr[pivot]) {
            return BS(arr, target, 0, pivot);
        } else {
            return BS(arr, target, pivot + 1, arr.length - 1);
        }
    }

    // Function definition to find the pivot
    int findpivot(int[] arr) {
        // Initialize start and end indices
        int start = 0;
        int end = arr.length - 1;

        // Perform binary search to find the pivot
        while (start <= end) {
            // Calculate mid index
            int mid = (start + end) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // No pivot found, i.e. the array is not rotated.
        return -1;
    }

    int BS(int[] a, int b, int start, int end) {
        // Binary Search algorithm
        while (start <= end) {
            // Calculate mid index
            int mid = start + (end - start) / 2;
            if (a[mid] == b) { // If element found at mid
                return mid;
            }
            if (a[mid] < b) { // If element is in the right half
                start = mid + 1;
            } else { // If element is in the left half
                end = mid - 1;
            }
        }
        // If element not found, return -1
        return -1;
    }
}
