class Solution {
public:
    long long coloredCells(int n) {
        long long ans = 0;
        for(int i = 1; i <=n ;i++) {
            ans += (i-1)*4;
        }
        return ans+1;
    }
};