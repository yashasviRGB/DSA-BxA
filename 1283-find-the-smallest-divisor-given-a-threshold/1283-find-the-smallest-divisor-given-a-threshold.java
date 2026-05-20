class Solution {
    public int check(int[] nums, int t, int divisor){
        int sum = 0;
        for(int i : nums){
            sum += Math.ceil((double)i / divisor);
            if(sum > t){
                return sum;
            }
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;

        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int num : nums){
            high = Math.max(high, num);
        }
        high += 1;
        int result = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            int sum = check(nums,threshold, mid);
            if(sum <= threshold){
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