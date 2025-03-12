class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> hash;
        vector<int>ans(2,0);
        for(int i=0; i<nums.size(); i++){
            int complement = target-nums[i];
            if(hash.find(complement) == hash.end()){
                hash[nums[i]] = i;
            } else{
                ans[0]= hash[complement];
                ans[1]= i;
                break;
            }
        }
        return ans;
    }
};