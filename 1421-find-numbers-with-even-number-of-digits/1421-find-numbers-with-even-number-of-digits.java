class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count ++;
            }
        }
        return count;
    }
    boolean even(int num){
        int digitsnum = digit(num);
        return digitsnum%2 ==0;
    }
    int digit(int n){
        return (int)(Math.log10(n))+1;
    }
}