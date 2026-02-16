class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // int front = 0;
        int end = 0;
        int n = nums.length;
        int sum = 0;
        int len = Integer.MAX_VALUE;
        // int currlen = 0;
        for(int front = 0; front<=n-1; front++){
            sum += nums[front];

            while(sum >= target){
                len = Math.min(front - end + 1, len);
                sum -= nums[end];
                end++; 
            }
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
}