class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int candy = n;
        int i = 1;
        while(i < n){
            if(ratings[i] == ratings[i - 1]){
                i++;
                continue;
            }

            int peak = 0;
            while(ratings[i] > ratings[i-1]){
                i++;
                peak++;
                candy += peak;
                if(i >= n) return candy;
            }
            int valley = 0;
            while(i < n && ratings[i] < ratings[i - 1]){
                valley++;
                candy += valley;
                i++;
            }
            candy -= Math.min(peak,valley);
        }
        return candy;
    }
}