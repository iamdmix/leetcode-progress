class Solution {
    public boolean searchMatrix(int[][] a, int b) {
        int r = 0;
        int c = a[0].length - 1;
        while (r < a.length && c >= 0) {
            if (a[r][c] == b) {
                return true;
            }
            if (a[r][c] < b) {
                r++;
            } else {
                c--;
            }
        }
        return false; // If element not found
    }
}
