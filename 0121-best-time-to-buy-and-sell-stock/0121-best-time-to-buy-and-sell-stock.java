class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] maxi = new int[n];
        int maximum = Integer.MIN_VALUE;
        for(int i = n-1; i >= 0; i--){
            if(prices[i] > maximum){
                maximum = prices[i];
                maxi[i] = maximum;
            }
            else{
                maxi[i] = maximum;
            }
        }
        int result = 0;
        for(int i = 0; i< n-1; i++){
            result = Math.max(result, maxi[i] - prices[i]);
        }
        return result;
    }
}