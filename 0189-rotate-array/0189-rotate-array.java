class Solution {
    public void solve(int[] nums, int i , int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int pivot = n - k - 1;
        // if(k > n){
        //     solve(nums,0,n-1);
        //     return;
        // }
        

        solve(nums,0,pivot);
        solve(nums,pivot+1,n-1);
        solve(nums,0,n-1);
    }
}