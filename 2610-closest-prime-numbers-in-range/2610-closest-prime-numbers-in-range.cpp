class Solution {
public:
    vector<int> closestPrimes(int left, int right) {
        vector<int> primes;
        vector<int> ans(2, -1);

        // Find all primes in range [left, right]
        for (int i = left; i <= right; i++) {
            if (i < 2) continue; // 0 and 1 are not prime
            bool prime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primes.push_back(i);
            }
        }

        // Edge case: If no primes or only one prime found, return {-1, -1}
        if (primes.size() < 2) return ans;

        // Find the closest prime pair
        int minDiff = INT_MAX;
        for (size_t i = 0; i < primes.size() - 1; i++) {
            int diff = primes[i + 1] - primes[i];
            if (diff < minDiff) {
                minDiff = diff;
                ans[0] = primes[i];
                ans[1] = primes[i + 1];
            }
        }

        return ans;
    }
};
