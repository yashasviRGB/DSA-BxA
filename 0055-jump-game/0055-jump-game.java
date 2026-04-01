class Solution {
    public boolean canJump(int[] nums) {
        int curr = nums[0];
        int n = nums.length;
        if(n == 1) return true;
        for(int i = 0; i < n; i++){
            if(curr <= nums[i])
                curr = nums[i];
            if(curr == 0 && i != n-1) return false;
            curr--;
        }
        return true;
    }
}