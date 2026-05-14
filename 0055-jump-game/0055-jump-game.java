class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int currJump = nums[0];
        int i = 1;
        for(; i< n-1; i++){
            if(currJump <= 0) return false;
            currJump -= 1;
            
            currJump = Math.max(currJump,nums[i]);
        }
        if(i == n-1 && currJump <= 0) return false;
        return true;
    }
}













    // public boolean canJump(int[] nums) {
    //     int curr = nums[0];
    //     int n = nums.length;
    //     if(n == 1) return true;
    //     for(int i = 0; i < n; i++){
    //         if(curr <= nums[i]){
    //             curr = nums[i];
    //         }
    //         if(curr == 0 && i != n-1) return false;
    //         curr--;
    //     }
    //     return true;
    // }
