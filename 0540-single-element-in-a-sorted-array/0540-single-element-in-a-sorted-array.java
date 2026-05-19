class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n -1;
        while(low < high){
            int mid = (low + high)/2;

            if(nums[mid] == nums[mid-1]){
                int leftsize = mid - 1 - low;
                int rightsize = high - mid;
                if(leftsize % 2 != 0){
                    high = mid - 2;
                }
                else{
                    low = mid + 1;
                }
            }
            else if(nums[mid] ==  nums[mid + 1]){
                int leftsize = mid - low;
                int rightsize = high - mid - 1;
                if(leftsize % 2 != 0){
                    high = mid - 1;
                }
                else{
                    low = mid + 2;
                }
            }
            else{
                return nums[mid];
            }
        }
        return nums[low];
    }
}