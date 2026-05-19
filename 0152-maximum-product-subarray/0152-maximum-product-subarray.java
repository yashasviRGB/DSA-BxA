class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int prod = 1;
        for(int i = 0; i<n; i++){
            prod *= nums[i];
            max1 = Math.max(max1, prod);
            if(prod == 0) prod = 1;
        }
        prod = 1;
        for(int i = n-1; i >= 0; i--){
            prod *= nums[i];
            max2 = Math.max(max2, prod);
            if(prod == 0) prod = 1;
        }
        return Math.max(max1, max2);
    }
}