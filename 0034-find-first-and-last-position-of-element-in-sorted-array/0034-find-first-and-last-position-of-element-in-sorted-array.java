class Solution {
    public int secondOcc(int[] nums, int target){
        int n = nums.length;
        int low = 0;
        int index = -1;
        int high = n - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                index = mid;
                low = mid+1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return index;
    }
    public int firstOcc(int[] nums, int target){
        int n = nums.length;
        int low = 0;
        int index = -1;
        int high = n - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                index = mid;
                high = mid-1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return index;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = firstOcc(nums,target);
        result[1] = secondOcc(nums,target);
        return result;
    }
}