class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int low = 1;
        int high = n-1;
        int mid = (low + high) / 2;

        while(low <= high){
            mid = (low + high) / 2;
            int count = 0;

            for(int i = 0; i < n; i++){
                if(nums[i] <= mid){
                    count++;
                } 
            }
            if(count > mid){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}