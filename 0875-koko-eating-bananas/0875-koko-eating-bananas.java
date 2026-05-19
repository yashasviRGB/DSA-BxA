class Solution {
    public boolean check(int[] piles, int h, int value){
        long totalhours = 0;
        for(int num : piles){
            // totalhours += Math.ceil((double) num / value);
            totalhours += (num + value - 1) / value;
        }
        return totalhours <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int num : piles){
            // low = Math.min(low,num);
            high = Math.max(high,num);
        }
        int result = high;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(check(piles,h,mid)){
                result = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return result;
    }
}