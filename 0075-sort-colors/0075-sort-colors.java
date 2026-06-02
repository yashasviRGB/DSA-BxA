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
            }
            else if(nums[j] == 1){
                j++;
            }
            else {
                swap(j,i,nums);
                i++;
                j++;
            }
            
        }
    }
}







// if(nums[j] == 2){
//                 swap(l,j,nums);
//                 l--;
//                 //In DNF, you never skip indices blindly. 
//                 //We are checking only by j pointer
//                 // while(l >= 0 && nums[l] == 2) l--; 
//                 continue;
//             }
//             else if(nums[j] == 0){
//                 swap(i,j, nums);
//                 i++;
//                 // while(i < n-1 && nums[i] == 0)i++;
//             }
            
//             j++;