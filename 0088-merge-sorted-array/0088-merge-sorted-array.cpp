class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        vector<int>arr(m+n);
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k]= nums1[i++];
            }
            else{
                arr[k] = nums2[j++];
            }
            k++;
        }
        while(i<m){
            arr[k] = nums1[i++];
            k++;
        }
        while(j<n){
            arr[k] = nums2[j++];
            k++;
        }
        for(int i=0; i<m+n; i++){
            nums1[i] = arr[i];
        }
    }
};