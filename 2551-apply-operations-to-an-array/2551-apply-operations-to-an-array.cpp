class Solution {
public:
    vector<int> applyOperations(vector<int>& nums) {
        //ith = i+1th, i*2, i+1=0
        int count =0, j=nums.size()-1;
        for(int i=0; i<nums.size()-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
                count++;
            }
        }
        //then shift all 0's to the end
        int index=0;
        for(int i=0; i<nums.size(); i++){
            if(nums[i] != 0){
                swap(nums[i],nums[index++]);
            }
        }
        return nums;
    }
};