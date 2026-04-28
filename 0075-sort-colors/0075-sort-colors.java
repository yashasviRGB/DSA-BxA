class Solution {
    public void swap(int i ,int j , int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int l = n-1;
        while(j <= l){
            if(nums[j] == 2){
                swap(l,j,nums);
                l--;
                // while(l >= 0 && nums[l] == 2) l--;
                continue;
            }
            else if(nums[j] == 0){
                swap(i,j, nums);
                i++;
                // while(i < n-1 && nums[i] == 0)i++;
            }
            
            j++;
            
        }
    }
}