class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int extra = -1;
        for(int i = 0; i< n; i++){
            int curr = nums[i];
            while(curr != i && i < n){
                if(curr == n){
                    extra = n;
                    break;
                }
                nums[i] = nums[curr];
                nums[curr] = curr;
                curr = nums[i];
            }
        }
        int result = -1;
        if(extra != n) return n;
        for(int i = 0; i< n; i++){
            if(nums[i] != i) result = i;
        }
        return result;
    }
}