class Solution {
public:
    int minimumRecolors(string blocks, int k) {
        int n = blocks.length();
        int minOperations = INT_MAX;
        
        // Sliding window approach
        // Count white blocks in the first window of size k
        int whiteCount = 0;
        for(int i = 0; i < k; i++) {
            if(blocks[i] == 'W') {
                whiteCount++;
            }
        }
        minOperations = whiteCount;
        
        // Slide the window through the rest of the string
        for(int i = k; i < n; i++) {
            // Remove the contribution of the first character of previous window
            if(blocks[i - k] == 'W') {
                whiteCount--;
            }
            // Add the contribution of the current character
            if(blocks[i] == 'W') {
                whiteCount++;
            }
            // Update minimum operations if current window needs fewer operations
            minOperations = min(minOperations, whiteCount);
        }
        
        return minOperations;
    }
};