class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        return bs(nums, target, start, end);
    }
    public int bs(int[]arr, int t, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s +(e-s)/2;
        if(t==arr[m]){
            return m;
        }
        if(t>arr[m]){
            return bs(arr, t, m+1, e);
        }
        return bs(arr, t, s, m-1);
    }
}