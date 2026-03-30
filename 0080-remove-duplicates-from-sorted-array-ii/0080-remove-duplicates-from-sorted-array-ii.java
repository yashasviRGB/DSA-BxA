class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0 || n == 1 || n == 2) return n;
        int i = -1;
        int prev = -1;
        int count = 1;
        for(int j = 0; j < n; j++){
            if(nums[j] == prev){
                if(count == 1){
                    i++;
                    nums[i] = nums[j];
                    prev = nums[i];
                    count = 2;
                }
                else if(count >= 2){
                    continue;
                }
            }
            else{
                i++;
                nums[i] = nums[j];
                prev = nums[i];
                count = 1;
            }
        }
        return i+1;

    }
}