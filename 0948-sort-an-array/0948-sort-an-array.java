class Solution {
    public int[] sortArray(int[] nums) {
        ms(nums,0,nums.length-1);
        return nums;
    }
    public void ms(int[]nums, int s, int e){
        if(s<e){
            int mid = s + (e-s)/2;
            ms(nums,s,mid);
            ms(nums,mid+1,e);
            merge(nums,s,mid,e);
        }
    }
    public void merge(int[]nums, int s, int mid, int e){
        int n1 = mid-s+1;
        int n2 = e-mid;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        int k=s;
        for(int i=0; i<n1; i++){
            arr1[i] = nums[k];
            k++;
        }
        for(int j=0; j<n2; j++){
            arr2[j] = nums[k];
            k++;
        }
        k=s;
        int i=0, j=0;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                nums[k] = arr1[i];
                i++;
            }
            else{
                nums[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            nums[k] = arr1[i];
            k++;i++;
        }
        while(i<n1){
            nums[k] = arr2[j];
            k++;j++;
        }
    }
}