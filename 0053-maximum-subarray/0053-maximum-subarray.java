class Solution {
    public int maxSubArray(int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        int result = nums[0];
        int sum = 0;
        while(i < n) {
            sum = nums[i] + sum;
            result = Math.max(result, sum);
            if(sum < 0) sum = 0;
            i++;
        }
        return result;
    }
}