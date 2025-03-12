class Solution {
    public int maximumWealth(int[][] accounts) {
        //To initialise the ans
        int ans = Integer.MIN_VALUE;
        
        for(int i=0; i<accounts.length; i++){
            //To initialise sum for every row (Person)
            int sum = 0;
            for(int j=0; j<accounts[i].length; j++){
                sum  += accounts[i][j];
            }

            //To find the richest
            if(sum>ans){
                ans = sum;
            }
        }

        //To return the richest customer wealth
        return ans;

    }
}