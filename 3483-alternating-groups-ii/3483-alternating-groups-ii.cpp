class Solution {
public:
    int numberOfAlternatingGroups(vector<int>& colors, int k) {
        int n = colors.size();
        if (n < k) return 0;  // Not enough elements to form one group

        int count = 1, groups = 0;

        // We need to check exactly `n` windows of size `k` in the circular array
        for (int i = 1, start = 0; i < 2 * n; i++) {
            if (colors[i % n] != colors[(i - 1) % n]) {
                count++;  // Continue the alternating sequence
            } else {
                count = 1;  // Reset the count if the sequence breaks
                start = i;  // Move the window start
            }

            if (i - start + 1 == k) {  // When the window size is exactly k
                groups++;  // A valid alternating group
                start++;   // Slide the window forward
                count--;   // Adjust count accordingly
            }

            if (i >= n + k - 2) break;  // Stop after checking n windows
        }

        return groups;
    }
};
