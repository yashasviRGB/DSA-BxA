class Solution {
    public int solve(int[] nums, int low, int high, int target){
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int mid = (low + high)/2;
        while(low < high){
            
            if(nums[mid] >= nums[n-1]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
            mid = (low + high)/2;
        }
        return low;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivot = findMin(nums);
        int index = -1;
        if(target >= nums[pivot] && target <= nums[n-1]){
            index = solve(nums,pivot, n - 1, target);
        }
        else{
            index = solve(nums,0, pivot - 1, target);
        }
        return index;
    }
}