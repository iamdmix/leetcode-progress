class Solution {
    public int[] buildArray(int[] nums) {
        Perm(nums,0);
        return nums;
    }
    
    void Perm(int[] nums,int start){
        if(start<nums.length){
            int result=nums[nums[start]];
            Perm(nums,start+1);
            nums[start]=result;
        }

        }

    }