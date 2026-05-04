class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int slow = 0;
        int fast = 0;
        do{
            int numAtSlow = nums[slow];
            slow = numAtSlow;
            int numAtFast = nums[fast];
            fast = nums[numAtFast];

        }while(slow != fast);
        slow = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
        // int low = 1;
        // int high = n-1;
        // int mid = (low + high) / 2;

        // while(low <= high){
        //     mid = (low + high) / 2;
        //     int count = 0;

        //     for(int i = 0; i < n; i++){
        //         if(nums[i] <= mid){
        //             count++;
        //         } 
        //     }
        //     if(count > mid){
        //         high = mid-1;
        //     }
        //     else{
        //         low = mid+1;
        //     }
        // }
        // return low;
    }
}