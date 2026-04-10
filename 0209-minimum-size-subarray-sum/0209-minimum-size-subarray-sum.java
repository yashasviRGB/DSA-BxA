class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int s = 0;
        int e = 0;
        e++;
        int sum = nums[0];
        int len = Integer.MAX_VALUE;
        if(sum >= target) len = Math.min(len, 1);
        int currLen = 1;
        int n = nums.length;
        while(e < n && s < n){
            if(sum < target){
                sum += nums[e];
                e++;
                currLen++;
            }
            else{
                len = Math.min(len, currLen);
                sum -= nums[s];
                s++;
                currLen--;
            }
        }
        while(sum >= target && s < n){
            len = Math.min(len, currLen);
            sum -= nums[s];
            s++;
            currLen--;
        }
        return (len == Integer.MAX_VALUE) ? 0 : len;
    }
}