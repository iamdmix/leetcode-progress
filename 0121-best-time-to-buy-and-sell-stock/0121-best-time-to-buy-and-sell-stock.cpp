class Solution {
public:
    int maxProfit(vector<int>& arr) {
        int n = arr.size()-1;
        int max = 0;
        int min = arr[0];
        int profit = 0;
        for(int i=1; i<=n; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            profit = arr[i]-min;
            if(profit>max){
                max = profit;
            }
        
        }
        return max;
    }
};