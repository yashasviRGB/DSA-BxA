class Solution {
    public int check(int[] weights, int days, int value){
        int day = 1;
        int currsum = 0;
        for(int num: weights){
            if (currsum + num <= value) {
                currsum += num;
            } 
            else{
                currsum = num;
                day++;
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int num: weights){
            high += num;
            low = Math.max(low,num);
        }
        int result = -1;
        while(low < high){
            int mid = low + (high - low)/2;
            int day = check(weights, days, mid);
            if(day > days){
                low = mid +1;
            }
            else {
                // result = mid;
                high = mid;
            }
        }
        return low;

    }
}