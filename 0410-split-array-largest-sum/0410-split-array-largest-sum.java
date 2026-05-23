class Solution {
    boolean check(int[] nums, int k,int x){
        int curr = 0;
        int noa = 1;
        for(int num : nums){
            if(curr + num > x){
                noa++;
                curr = num;
            }
            else{
                curr += num;
            }
        }
        return noa <= k;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low = nums[0];
        int high = 0;
        for(int num : nums){
            low = Math.max(low, num);
            high += num;
        }
        int result = -1;
        while(low <= high){
            int mid = (low + high)/2;
            boolean checking = check(nums,k,mid);
            if(checking){
                high = mid - 1;
                result = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return result;
    }
}