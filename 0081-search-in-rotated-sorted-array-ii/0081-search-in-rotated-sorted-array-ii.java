class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                //right
                return true;
            }
            else if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low++;
                high--;
            }
            else if(nums[low] <= nums[mid]){
                if(nums[low] <= target && nums[mid] > target){
                    //left
                    high = mid -1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(nums[mid] < target && nums[high] >= target){
                    //left
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}