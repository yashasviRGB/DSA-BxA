class Solution {
    public int removeDuplicates(int[] nums) {
        // int i = 0;
        int n = nums.length;
        if(n == 0) return 0;
        int count = 1;
        int k = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] != nums[i-1]){
                count++;
                nums[k] = nums[i];
                k++;
            }
            // count++;
        }
        return count;
    }
}