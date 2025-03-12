class Solution {
public:
    vector<vector<int>> mergeArrays(vector<vector<int>>& nums1, vector<vector<int>>& nums2) {
        vector<vector<int>> ans(nums1.size() + nums2.size(), vector<int>(2)); // Preallocate space
        int i = 0, j = 0, k = 0;

        while (i < nums1.size() && j < nums2.size()) {
            if (nums1[i][0] == nums2[j][0]) { 
                ans[k][0] = nums1[i][0];
                ans[k][1] = nums1[i][1] + nums2[j][1];
                i++, j++;
            } else if (nums1[i][0] < nums2[j][0]) { 
                ans[k][0] = nums1[i][0];
                ans[k][1] = nums1[i][1];
                i++;
            } else { 
                ans[k][0] = nums2[j][0];
                ans[k][1] = nums2[j][1];
                j++;
            }
            k++;
        }

        while (i < nums1.size()) {
            ans[k][0] = nums1[i][0];
            ans[k][1] = nums1[i][1];
            i++, k++;
        }

        while (j < nums2.size()) {
            ans[k][0] = nums2[j][0];
            ans[k][1] = nums2[j][1];
            j++, k++;
        }

        ans.resize(k); // Resize to remove unused elements
        return ans;
    }
};
