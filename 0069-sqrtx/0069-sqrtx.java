class Solution {
    public int mySqrt(int n) {
        if (n <= 1) return n;
        
        long start = 0;
        long end = n;
        
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid * mid;
            
            if (square == n) {
                return (int) mid;
            } else if (square < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) end;
    }
}
