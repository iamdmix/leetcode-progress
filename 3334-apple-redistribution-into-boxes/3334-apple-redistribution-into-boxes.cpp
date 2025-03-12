class Solution {
public:
    int minimumBoxes(vector<int>& apple, vector<int>& capacity) {
        int sum = 0;
        for (int i = 0; i < apple.size(); i++) {
            sum += apple[i];  // Calculate total apples needed
        }

        // Sort capacity in descending order
        sort(capacity.rbegin(), capacity.rend());

        int boxCount = 0, currApples = 0;
        for (int i = 0; i < capacity.size(); i++) {
            currApples += capacity[i];  // Fill the box
            boxCount++;

            if (currApples >= sum) return boxCount;  // Stop when we have enough apples
        }
        return boxCount;
    }
};
